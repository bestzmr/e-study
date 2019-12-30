package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.TeacherShow;
import cn.bestsort.e_study.service.TeacherShowService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教师风采相关API
 *
 * @author bestsort
 * @version 1.0
 * @date 12/30/19 10:29 AM
 */
@Api(tags = "教师风采相关")
@RestController
public class TeacherShowController {
    @Autowired
    private TeacherShowService teacherShowService;

    @ApiOperation("通过pageNo(页码)和pageSize(页大小)获取对应教师风采列表")
    @GetMapping("/listTeacherShows")
    public PageInfo<TeacherShow> listTeacherShow(@RequestParam(name = "pageSize",defaultValue = "5") int pageSize,
                                             @RequestParam(name = "pageNo",defaultValue = "1") int pageNo){
        return teacherShowService.listTeacherShows(pageNo,pageSize);
    }

    @ApiOperation("通过 id 获取教师风采文章详情")
    @GetMapping("/getTeacherShowDetail")
    public TeacherShow getDetail(@RequestParam("id") long articleId){
        return teacherShowService.getTearcherShowDetail(articleId);
    }
}
