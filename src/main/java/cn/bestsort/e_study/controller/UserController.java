package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.Course;
import cn.bestsort.e_study.pojo.dto.User;
import cn.bestsort.e_study.service.SelectCourseService;
import cn.bestsort.e_study.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ganchaoyang
 * @date 2019/3/1013:55
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SelectCourseService selectCourseService;


    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public Boolean register( User user,  Course course){
        if (userService.isUserExist(user.getTel())){
            //该用户已存在
            return false;
        }else{
            //用户不存在，添加该用户
            boolean result = userService.addUser(user);
            if(!result){
                //注册失败，请重新输入
                return false;
            }
            //选课
            //注册成功，返回登录页面
            return selectCourseService.addSelectCourse(course,userService.getUserId(user));
        }
    }

    @ApiOperation(value = "用户登录")
    @GetMapping("/login")
    public Boolean login( User user){
        return userService.login(user);
    }
}
