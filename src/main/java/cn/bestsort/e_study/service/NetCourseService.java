package cn.bestsort.e_study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 16:37
 */
@Service
public class NetCourseService {
    @Autowired
    private NetCourseService netCourseService;
    public Boolean uploadVideo(@RequestParam("file")MultipartFile file ,
                               @RequestParam("decription") String description,
                               @RequestParam("name") String name){

        return false;
    }
}
