package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.pojo.dto.TeacherShow;
import cn.bestsort.e_study.pojo.dto.TeacherShowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherShowMapper {
    long countByExample(TeacherShowExample example);

    int deleteByExample(TeacherShowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeacherShow record);

    int insertSelective(TeacherShow record);

    List<TeacherShow> selectByExample(TeacherShowExample example);

    TeacherShow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeacherShow record, @Param("example") TeacherShowExample example);

    int updateByExample(@Param("record") TeacherShow record, @Param("example") TeacherShowExample example);

    int updateByPrimaryKeySelective(TeacherShow record);

    int updateByPrimaryKey(TeacherShow record);
}