package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.HighSchoolInfo;
import cn.bestsort.e_study.pojo.vo.HighSchoolVo;
import cn.bestsort.e_study.service.HighSchoolInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/30/19 3:57 PM
 */
@Api(tags = "中考资讯相关接口")
@RequestMapping("/HighSchool")
@RestController
public class HighSchoolInfoController {
    @Autowired
    private HighSchoolInfoService service;

    @ApiOperation(value = "通过[area](学区)、[pageNo](页码)和[pageSize](页大小)获取对应中考咨询列表)",
            notes = "获取学校信息(简介、官网、所属学区)\nPs.带[]的参数均可不填")
    @GetMapping("/listAll")
    public PageInfo<HighSchoolInfo> getPage(@RequestParam(defaultValue = "1") int pageNo,
                                            @RequestParam(defaultValue = "5") int pageSize,
                                            @RequestParam(required = false) String area){
        return service.listHighSchools(pageNo,pageSize,area);
    }

    @ApiOperation("根据id获取对应中学详情(学区、官网、简介)")
    @GetMapping("/getDetailById")
    public HighSchoolVo getHighSchoolInfoDetail(@RequestParam(required = false) Long id,
                                                @RequestParam(defaultValue = "2017") int beginYear,
                                                @RequestParam(defaultValue = "2019") int endYear){
        return service.getHighSchoolDetail(id,beginYear,endYear);
    }

    @ApiOperation("获取所有中学信息")
    @GetMapping("/getAllHighSchools")
    public List<HighSchoolInfo> getHighSchoolList(){
        return service.listHighSchools();
    }

    @ApiOperation("获取所有的学区")
    @GetMapping("/listAllArea")
    public List<String> getHighSchoolArea(){
        return service.getAllHighSchoolArea();
    }
}
