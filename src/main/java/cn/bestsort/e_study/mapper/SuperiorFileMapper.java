package cn.bestsort.e_study.mapper;

import cn.bestsort.e_study.pojo.dto.SuperiorFile;
import cn.bestsort.e_study.pojo.dto.SuperiorFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorFileMapper {
    long countByExample(SuperiorFileExample example);

    int deleteByExample(SuperiorFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SuperiorFile record);

    int insertSelective(SuperiorFile record);

    List<SuperiorFile> selectByExample(SuperiorFileExample example);

    SuperiorFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SuperiorFile record, @Param("example") SuperiorFileExample example);

    int updateByExample(@Param("record") SuperiorFile record, @Param("example") SuperiorFileExample example);

    int updateByPrimaryKeySelective(SuperiorFile record);

    int updateByPrimaryKey(SuperiorFile record);
}