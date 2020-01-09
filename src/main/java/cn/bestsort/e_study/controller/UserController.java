package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.TeacherShow;
import cn.bestsort.e_study.pojo.dto.User;
import cn.bestsort.e_study.service.CourseService;
import cn.bestsort.e_study.service.SelectCourseService;
import cn.bestsort.e_study.service.TeacherShowService;
import cn.bestsort.e_study.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ganchaoyang
 * @date 2019/3/1013:55
 */
@Controller
@RequestMapping("/user")
@Api(tags = "用户相关接口")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SelectCourseService selectCourseService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherShowService teacherShowService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ModelAndView register(@RequestParam(name = "username",required=false) String username,
                            @RequestParam(name = "sex",required=false) String sex,
                            @RequestParam(name = "tel",required=false) String tel,
                            @RequestParam(name = "password",required=false) String password,
                            @RequestParam(name = "age",required=false) int age,
                            @RequestParam(name = "school",required=false) String school,
                            @RequestParam(name = "parentsName",required=false) String parentsName,
                            @RequestParam(name = "parentsTel",required=false) String parentsTel,
                            @RequestParam(name = "courseName",required=false) String courseName,
                            @RequestParam(name = "teacher",required=false) String teacher,
                            @RequestParam(name = "schoolHour",required=false) int schoolHour
                            ){
        ModelAndView modelAndView = new ModelAndView("fail");
        System.out.println("==========");
        User user = new User();
        user.setTel(tel);
        user.setAge(age);
        user.setName(username);
        user.setParentName(parentsName);
        user.setParentTel(parentsTel);
        user.setPassword(password);
        user.setWeChat(tel);
        System.out.println(sex);
        if (sex != null) {
            user.setSex(new Byte(sex));
        }

        user.setSchool(school);
        System.out.println(user);
        Course course = new Course();
        course.setName(courseName);
        course.setTeacher(teacher);
        course.setSchoolHour(schoolHour);
        if (!userService.isUserExist(user.getTel())){
            System.out.println("用户已存在");
            //该用户已存在
            return modelAndView;
        }else{
            //用户不存在，添加该用户
            boolean result = userService.addUser(user);
            if(!result){
                System.out.println("注册失败");
                //注册失败，请重新输入
                return modelAndView;
            }
            //选课
            //注册成功，返回登录页面
             selectCourseService.addSelectCourse(course,userService.getUserId(user));
             modelAndView = new ModelAndView("login");
            return modelAndView;
        }
    }

    @ApiOperation(value = "用户登录")
    @GetMapping("/login")
    public ModelAndView login(HttpServletRequest request,
                         @RequestParam(name = "tel",required = false) String tel,
                         @RequestParam(name = "password",required = false) String password){
        User user = new User();
        user.setTel(tel);
        user.setPassword(password);
        HttpSession session = request.getSession();
        User user2 = userService.login(user);
        if (user2!=null){
            System.out.println("uuuuuuuu");
            session.setAttribute("user",user2);
        }
        List<Course> courseList = courseService.listAllCourse();
        PageInfo<TeacherShow> pageInfo = teacherShowService.listTeacherShows(1, 5);
        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("courseList", courseList);
        modelAndView.addObject("page", pageInfo);
        return modelAndView ;
    }
}
