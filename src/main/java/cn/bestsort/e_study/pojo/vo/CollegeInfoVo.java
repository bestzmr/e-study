package cn.bestsort.e_study.pojo.vo;

import cn.bestsort.e_study.pojo.dto.AdmissionInfo;
import cn.bestsort.e_study.pojo.dto.CollegeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/31/19 2:57 PM
 */

@Data
@ApiModel("后端  --> 前端数据传输类，包含大学学校信息和近年的招生策略。\n该实体用于：高考-名校查询模块的结果返回")
public class CollegeInfoVo {
    @ApiModelProperty("大学详情，包括包含学校链接、简介、是否双一流、是否重点、是否本科以及是否艺术类院校")
    CollegeInfo collegeInfo;

    @ApiModelProperty("大学招生政策信息。包含政策详情、学年信息、分数线")
    List<AdmissionInfo> admissionInfos;
}
