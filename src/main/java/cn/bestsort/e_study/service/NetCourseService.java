package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.NetCourseMapper;
import cn.bestsort.e_study.mapper.UserVideoMapper;
import cn.bestsort.e_study.pojo.dto.NetCourse;
import cn.bestsort.e_study.pojo.dto.NetCourseExample;
import cn.bestsort.e_study.pojo.dto.UserVideo;
import cn.bestsort.e_study.pojo.dto.UserVideoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 16:37
 */
@Service
public class NetCourseService {
    @Autowired
    private NetCourseMapper netCourseMapper;

    public Boolean uploadVideo( String name, String description, String url){

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
    public List<NetCourse> listAllNetCourse(List<UserVideo> userVideoList){
        NetCourse netCourse = null;
        List<NetCourse> netCourseList = null;
        for (UserVideo userVideo:userVideoList){
            NetCourseExample netCourseExample = new NetCourseExample();
            netCourseExample.createCriteria().andIdEqualTo(userVideo.getVideoId());
            netCourse = netCourseMapper.selectByExample(netCourseExample).get(0);
            netCourseList.add(netCourse);
        }
        return netCourseList;
    }

}
