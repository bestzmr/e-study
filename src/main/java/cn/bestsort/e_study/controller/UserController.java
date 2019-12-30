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
    @ApiOperation(value = "新增用户",notes = "这里是备注信息")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("通过id查找用户")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户信息")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }


    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public Boolean register( User user,  Course course){
        if (userService.isUserExist(user.getTel())){
            //该用户已存在
            return false;
        }else{
            //用户不存在，添加该用户
            boolean result = userService.addUser(user);
            if(result == false){
                //注册失败，请重新输入
                return false;
            }
            //选课
            boolean addSelectCourseResult = selectCourseService.addSelectCourse(course,userService.getUserId(user));
            if (addSelectCourseResult == false){
                //注册成功，返回登录页面
                return false;
            }
            return true;
        }
    }

    @ApiOperation(value = "用户登录")
    @GetMapping("/login")
    public Boolean login( User user){
        if (userService.login(user)){
            return true;
        }
        return false;
    }
}
