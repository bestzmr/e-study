package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.dto.HighSchoolInfo;
import cn.bestsort.e_study.dto.HighSchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HighSchoolInfoMapper {
    long countByExample(HighSchoolInfoExample example);

    int deleteByExample(HighSchoolInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HighSchoolInfo record);

    int insertSelective(HighSchoolInfo record);

    List<HighSchoolInfo> selectByExample(HighSchoolInfoExample example);

    HighSchoolInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HighSchoolInfo record, @Param("example") HighSchoolInfoExample example);

    int updateByExample(@Param("record") HighSchoolInfo record, @Param("example") HighSchoolInfoExample example);

    int updateByPrimaryKeySelective(HighSchoolInfo record);

    int updateByPrimaryKey(HighSchoolInfo record);
}