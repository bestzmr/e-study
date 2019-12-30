package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.pojo.dto.SelectCourse;
import cn.bestsort.e_study.pojo.dto.SelectCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectCourseMapper {
    long countByExample(SelectCourseExample example);

    int deleteByExample(SelectCourseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SelectCourse record);

    int insertSelective(SelectCourse record);

    List<SelectCourse> selectByExample(SelectCourseExample example);

    SelectCourse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);

    int updateByExample(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);

    int updateByPrimaryKeySelective(SelectCourse record);

    int updateByPrimaryKey(SelectCourse record);
}