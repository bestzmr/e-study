alter table teacher_show add column title_img varchar(200);
alter table college_info add column is_double_first tinyint;
alter table college_info add column is_key tinyint;
alter table college_info add column is_undergraduate tinyint;
alter table college_info add column is_art tinyint;
alter table college_info drop column type;