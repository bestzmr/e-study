package cn.bestsort.e_study.mapper;

import java.util.List;

import cn.bestsort.e_study.pojo.dto.NetCourse;
import cn.bestsort.e_study.pojo.dto.NetCourseExample;
import org.apache.ibatis.annotations.Param;

public interface NetCourseMapper {
    long countByExample(NetCourseExample example);

    int deleteByExample(NetCourseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NetCourse record);

    int insertSelective(NetCourse record);

    List<NetCourse> selectByExample(NetCourseExample example);

    NetCourse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NetCourse record, @Param("example") NetCourseExample example);

    int updateByExample(@Param("record") NetCourse record, @Param("example") NetCourseExample example);

    int updateByPrimaryKeySelective(NetCourse record);

    int updateByPrimaryKey(NetCourse record);
}