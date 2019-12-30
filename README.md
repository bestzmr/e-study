# E学网报名平台
本项目是大三·上学期的JSP课程设计作业， 后端采用 Spring Boot 实现。

## 快速开始

1. 先克隆仓库到本地
```bash
git clone https://github.com/AngryMerlin/e-study.git
```
2. 以下操作二选一：
    1. 将`pom.xml`中的数据库链接修改为自己本地数据库的链接、用户名、密码
    2. 手动创建用户，用户名`admin`，密码`AdminPassword`。仅允许本地登录，同时创建数据库`e_study`，编码格式为`utf8mb4`
3. 将项目导入到 IDE(推荐Intellij IDEA) 中， 若 IDE 没有自动导入，在安装了 Maven 的情况下，可使用`mvn flyway:migrate` 命令自动生成所需要的表(生成的同时会下载所有依赖)
4. 执行`mvn mybatis-generator:generate` 生成对应mapper
4. 点击运行即可

## 采用工具

- Spring Boot
- Lombok
- Flyway
- Swagger2
- Druid
- MyBatis
- MyBatis Generator

## 贡献者
### 后端
- bestsort
- AngryMerlin
### 前端