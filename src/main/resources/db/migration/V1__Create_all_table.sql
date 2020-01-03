create table user(
    id bigint auto_increment primary key,
    tel varchar(11) not null,
    password varchar(20) not null,
    name varchar(10) not null ,
    age int not null ,
    sex tinyint not null ,
    school varchar(20),
    user_class int,
    grade float ,
    /* 用户类型: 教师,学生 */
    is_admin tinyint default 0,
    we_chat varchar(20) not null,
    parent_tel varchar(11) not null ,
    parent_name varchar(10) not null
);
create table user_course(
    id bigint auto_increment primary key ,
    user_id bigint not null ,
    course_id bigint not null
);
create table course(
    id bigint auto_increment primary key ,
    name varchar(20) not null ,
    description varchar(200),
    teacher varchar(10),
    course_img varchar (200),
    /* 课时 */
    school_hour int not null ,
    total_people int default 0
);

create table teacher_show(
    id bigint auto_increment primary key ,
    title varchar(100) not null ,
    description varchar(1000) not null ,
    /* 编辑 */
    editor varchar(10),
    /* 作者 */
    author varchar(10) not null ,
    gmt_create bigint,
    /* 浏览量 */
    page_view bigint default 0
);
create table net_course(
    id bigint auto_increment primary key ,
    name varchar(20) not null ,
    description varchar(200) ,
    url varchar(200) not null
);
create table college_info(
    id bigint auto_increment primary key ,
    type tinyint not null ,
    url varchar(200),
    name varchar (20),
    area varchar(20),
    description varchar(200)
);
create table high_school_info(
    id bigint auto_increment primary key ,
    area varchar(20) not null ,
    url varchar(200),
    name varchar (20),
    description varchar(200)
);
create table admission_info(
    id bigint auto_increment primary key ,
    score int not null ,
    /* 政策 -> 文件地址 */
    policy varchar(200),
    policy_description varchar(1000),
    /* 学年 */
    school_year int not null,
    is_college tinyint not null
);

create table user_video(
    id bigint primary key auto_increment,
    user_id bigint not null ,
    video_id bigint not null
);
