#!/bin/bash
echo "begin restart..."
PID=$(ps -ef | grep spring-boot:run | grep -v "grep" | awk '{print $2}')
E_Study_Path=$(pwd)
echo "E_Study_PATH is ${E_Study_Path}"
kill -9 ${PID}
echo "begin update E_Study_Path from GitHub..."
cd ${E_Study_Path}

git pull
if [ $? -eq 0 ];then
    echo "kill java process success"  
    echo "restart E_Study"
    mvn flyway:migrate
    echo "database merge compelete,begin to restart E_Study_Path"
    nohup mvn spring-boot:run > /dev/null 2>&1 &
    echo -e "[\033[1;32;48mSUCCESS\033[0m] E_Study restart success"

else
    echo "kill java fail"
fi