package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.dto.TeacherShow;
import cn.bestsort.e_study.dto.TeacherShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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