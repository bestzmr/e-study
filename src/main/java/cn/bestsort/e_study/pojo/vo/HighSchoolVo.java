package cn.bestsort.e_study.pojo.vo;

import cn.bestsort.e_study.pojo.dto.AdmissionInfo;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 1/6/20 7:49 AM
 */

@Data
@ApiModel(description = "后端  --> 前端数据传输类，包含中学学校信息和近年的招生策略,默认为三年")
public class HighSchoolVo {
    @ApiModelProperty("中学详情")
    HighSchoolInfo highSchoolInfo;


    @ApiModelProperty("近年的招生信息")
    List<AdmissionInfo> admissionInfos;
}
