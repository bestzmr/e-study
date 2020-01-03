package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.CourseMapper;
import cn.bestsort.e_study.mapper.SelectCourseMapper;
import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.CourseExample;
import cn.bestsort.e_study.pojo.dto.SelectCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 15:25
 */
@Service
public class SelectCourseService {
    @Autowired
    private SelectCourseMapper selectCourseMapper;
    @Autowired
    private CourseMapper courseMapper;

    public Boolean addSelectCourse(Course course, long userId){
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andNameEqualTo(course.getName()).andTeacherEqualTo(course.getTeacher())
                .andSchoolHourEqualTo(course.getSchoolHour());
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        SelectCourse selectCourse = new SelectCourse();
        selectCourse.setCourseId(courseList.get(0).getId());
        selectCourse.setUserId(userId);
        int addResult = selectCourseMapper.insertSelective(selectCourse);
        if (addResult == 1){
            return true;
        }
        return false;
    }

}
