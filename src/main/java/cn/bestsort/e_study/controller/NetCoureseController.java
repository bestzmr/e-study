package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.service.NetCourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 17:06
 */
@RestController
@Api("网上视频相关接口")
@RequestMapping("/video")
public class NetCoureseController {
    @Autowired
    private NetCourseService netCourseService;
    @ApiOperation(value = "上传视频")
    @PostMapping("/uploadVideo")
    public Boolean uploadVideo(@RequestParam("file") MultipartFile file) throws IOException {
        try{
            System.out.println(file.getOriginalFilename());
        }catch (NullPointerException npe){
            npe.printStackTrace();
        }

        return false;
    }
}
