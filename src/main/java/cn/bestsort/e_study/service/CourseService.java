package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.CourseMapper;
import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.CourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
