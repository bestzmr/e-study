package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.NetCourseMapper;
import cn.bestsort.e_study.pojo.dto.NetCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 16:37
 */
@Service
public class NetCourseService {
    @Autowired
    private NetCourseMapper netCourseMapper;
    public Boolean uploadVideo(@RequestParam("name") String name,
                               @RequestParam("decription") String description,
                               @RequestParam("url")String url){

        NetCourse netCourse = new NetCourse();
        netCourse.setName(name);
        netCourse.setDescription(description);
        netCourse.setUrl(url);
        int result = netCourseMapper.insertSelective(netCourse);
        if (result == 1){
            return true;
        }
        return false;
    }
}
