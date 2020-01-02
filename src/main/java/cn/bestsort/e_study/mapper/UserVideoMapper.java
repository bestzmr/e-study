package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.pojo.dto.UserVideo;
import cn.bestsort.e_study.pojo.dto.UserVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVideoMapper {
    long countByExample(UserVideoExample example);

    int deleteByExample(UserVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserVideo record);

    int insertSelective(UserVideo record);

    List<UserVideo> selectByExample(UserVideoExample example);

    UserVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserVideo record, @Param("example") UserVideoExample example);

    int updateByExample(@Param("record") UserVideo record, @Param("example") UserVideoExample example);

    int updateByPrimaryKeySelective(UserVideo record);

    int updateByPrimaryKey(UserVideo record);
}