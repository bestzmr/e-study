package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.NetCourseMapper;
import cn.bestsort.e_study.mapper.UserVideoMapper;
import cn.bestsort.e_study.pojo.dto.NetCourse;
import cn.bestsort.e_study.pojo.dto.NetCourseExample;
import cn.bestsort.e_study.pojo.dto.UserVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 16:37
 */
@Service
public class NetCourseService {
    @Autowired
    private NetCourseMapper netCourseMapper;
    @Autowired
    private UserVideoMapper userVideoMapper;
    public Boolean uploadVideo( String name, String description, String url,long userId){

        NetCourse netCourse = new NetCourse();
        netCourse.setName(name);
        netCourse.setDescription(description);
        netCourse.setUrl(url);
        int result = netCourseMapper.insertSelective(netCourse);
        if (result == 1){
            NetCourseExample netCourseExample = new NetCourseExample();
            netCourseExample.createCriteria().andNameEqualTo(name).andDescriptionEqualTo(description).andUrlEqualTo(url);
            long netCourseId = netCourseMapper.selectByExample(netCourseExample).get(0).getId();
            UserVideo userVideo = new UserVideo();
            userVideo.setUserId(userId);
            userVideo.setVideoId(netCourseId);
            userVideoMapper.insertSelective(userVideo);
            return true;
        }
        return false;
    }
    public List<NetCourse> listAllNetCourse(List<UserVideo> userVideoList){
        NetCourse netCourse = null;
        List<NetCourse> netCourseList = new ArrayList<>();
        for (UserVideo userVideo:userVideoList){
            NetCourseExample netCourseExample = new NetCourseExample();
            System.out.println("-videoId-"+userVideo.getVideoId());
            netCourseExample.createCriteria().andIdEqualTo(userVideo.getVideoId());
            netCourse = netCourseMapper.selectByExample(netCourseExample).get(0);
            netCourseList.add(netCourse);
        }
        return netCourseList;
    }

}
