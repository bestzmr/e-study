package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.UserVideoMapper;
import cn.bestsort.e_study.pojo.dto.UserVideo;
import cn.bestsort.e_study.pojo.dto.UserVideoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhaoqiang
 * @Date 2020/1/1 20:17
 */
@Service
public class UserVideoService {
    @Autowired
    private UserVideoMapper userVideoMapper;
    public List<UserVideo> listAllUserVideo(long id){
        UserVideoExample userVideoExample = new UserVideoExample();
        userVideoExample.createCriteria().andUserIdEqualTo(id);
        List<UserVideo> userVideoList = userVideoMapper.selectByExample(userVideoExample);
        return userVideoList;
    }
}
