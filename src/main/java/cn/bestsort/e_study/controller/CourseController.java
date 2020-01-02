package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2020/1/2 7:54
 */
@RestController
@Api(tags = "课堂相关接口")
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("listCourse")
    public List<Course> getCourseList(){
        List<Course> courseList = courseService.listAllCourse();
        return courseList;
    }
}
