alter table college_info add column name varchar(30);
alter table high_school_info add column name varchar(30);
alter table admission_info add column is_college tinyint;
create table user_video(
    id bigint primary key auto_increment,
    user_id bigint not null ,
    video_id bigint not null
);
alter table course add column course_img varchar(200)