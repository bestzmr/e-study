package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.service.NetCourseService;
import cn.bestsort.e_study.utils.UuidUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 17:06
 */
@RestController
@Api(tags = "网上视频相关接口")
@RequestMapping("/video")
public class NetCoureseController {
    @Autowired
    private NetCourseService netCourseService;
    @ApiOperation(value = "上传视频")
    @PostMapping("/uploadVideo")
    public Boolean uploadVideo(@RequestParam("name") String name,
                               @RequestParam("description")String decription,
                               @RequestParam("file") MultipartFile file) throws IOException {
        String originalFilename =  file.getOriginalFilename();
        // 获取文件的后缀格式
        String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1).toLowerCase();
        String newFileName = UuidUtil.get32UUID() + "."+fileSuffix;
        if (!file.isEmpty()){
            File dest = new File(System.getProperty("user.dir")+"/src/main/resources/upload/"+newFileName);
            file.transferTo(dest);
            boolean result = netCourseService.uploadVideo(name,decription,newFileName);
            if (!result){
                return false;
            }
            return true;
        }
        return false;
    }
}
