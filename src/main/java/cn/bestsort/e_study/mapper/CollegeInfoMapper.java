package cn.bestsort.e_study.mapper;

import java.util.List;

import cn.bestsort.e_study.pojo.dto.CollegeInfo;
import cn.bestsort.e_study.pojo.dto.CollegeInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CollegeInfoMapper {
    long countByExample(CollegeInfoExample example);

    int deleteByExample(CollegeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CollegeInfo record);

    int insertSelective(CollegeInfo record);

    List<CollegeInfo> selectByExample(CollegeInfoExample example);

    CollegeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CollegeInfo record, @Param("example") CollegeInfoExample example);

    int updateByExample(@Param("record") CollegeInfo record, @Param("example") CollegeInfoExample example);

    int updateByPrimaryKeySelective(CollegeInfo record);

    int updateByPrimaryKey(CollegeInfo record);
}