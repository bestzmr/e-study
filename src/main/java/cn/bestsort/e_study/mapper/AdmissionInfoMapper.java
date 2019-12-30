package cn.bestsort.e_study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmissionInfoMapper {
    long countByExample(AdmissionInfoExample example);

    int deleteByExample(AdmissionInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdmissionInfo record);

    int insertSelective(AdmissionInfo record);

    List<AdmissionInfo> selectByExample(AdmissionInfoExample example);

    AdmissionInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdmissionInfo record, @Param("example") AdmissionInfoExample example);

    int updateByExample(@Param("record") AdmissionInfo record, @Param("example") AdmissionInfoExample example);

    int updateByPrimaryKeySelective(AdmissionInfo record);

    int updateByPrimaryKey(AdmissionInfo record);
}