package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.TeacherShow;
import cn.bestsort.e_study.service.CourseService;
import cn.bestsort.e_study.service.TeacherShowService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 9:57
 */
@Controller
@RequestMapping("/web")
public class WebController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherShowService teacherShowService;

    @RequestMapping("/index")
    public ModelAndView jumpIndex(@RequestParam(name = "pageSize", defaultValue = "5") int pageSize,
                                  @RequestParam(name = "pageNo", defaultValue = "1") int pageNo) {
        List<Course> courseList = courseService.listAllCourse();
        PageInfo<TeacherShow> pageInfo = teacherShowService.listTeacherShows(pageNo, pageSize);
        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("courseList", courseList);
        modelAndView.addObject("page", pageInfo);
        return modelAndView;
    }

    @RequestMapping("schoolProfile")
    public String jumpSchoolProfile() {
        return "schoolProfile";
    }
    @RequestMapping("showVideo")
    public String jumpShowVideo() {
        return "showVideo";
    }
    @RequestMapping("jumpLogin")
    public String jumpLogin() {
        return "login";
    }
    @RequestMapping("jumpRegister")
    public ModelAndView jumpRegister() {
        Set<String> courseNameSet = courseService.listAllCourseName();

        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("courseNameSet",courseNameSet);
        List<Course> courseList = courseService.listAllCourse();
        modelAndView.addObject("courseList",courseList);
        return modelAndView;
    }
    @RequestMapping("/highschool")
    public String jumpHighSchool(){
        return "highschool";
    }

    @RequestMapping("/middleschool")
    public String jumpMiddleSchool(){
        return "middleschool";
    }
}
