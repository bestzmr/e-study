package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.CourseMapper;
import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.CourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author zhaoqiang
 * @Date 2020/1/2 7:56
 */
@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> listAllCourse(){
        CourseExample courseExample = new CourseExample();
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        return courseList;
    }
    public Set<String> listAllCourseName(){
        CourseExample courseExample = new CourseExample();
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        Set<String> set = new HashSet<String>();
        for (Course course:courseList){
            set.add(course.getName());
        }
        return set;
    }
//    public Set<String> listAllCourseTeacher(String name){
//        CourseExample courseExample = new CourseExample();
//        courseExample.createCriteria().andNameEqualTo(name);
//        List<Course> courseList
//    }
}
