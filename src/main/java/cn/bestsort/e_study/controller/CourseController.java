package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2020/1/2 7:54
 */
@Controller
@Api(tags = "课堂相关接口")
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/listCourse")
    public List<Course> getCourseList(){
        List<Course> courseList = courseService.listAllCourse();
        return courseList;
    }
    @GetMapping("/getCourse")
    public ModelAndView getCourse(@RequestParam("name") String name,
                                  @RequestParam("description") String description,
                                  @RequestParam("schoolHour") String schoolHour,
                                  @RequestParam("totalPeople") String totalPeople,
                                  @RequestParam("courseImg") String courseImg){
        ModelAndView modelAndView = new ModelAndView("courseSystem");
        modelAndView.addObject("name",name);
        modelAndView.addObject("description",description);
        modelAndView.addObject("schoolHour",schoolHour);
        modelAndView.addObject("totalPeople",totalPeople);
        modelAndView.addObject("courseImg",courseImg);
        return modelAndView;
    }
//    @GetMapping("/getCourseName")
//    public ModelAndView getCourseName(@RequestParam(name = "courseName") String courseName){
//        System.out.println("++++++++++++");
//        System.out.println(courseName);
//        ModelAndView modelAndView = new ModelAndView("register");
//        List<Course> courseList = courseService.listAllCourse();
//        modelAndView.addObject("courseList",courseList);
//        modelAndView.addObject("courseName",courseName);
//        return modelAndView;
//    }
}
