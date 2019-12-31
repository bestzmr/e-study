package cn.bestsort.e_study.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/31/19 9:38 AM
 */
@Data
@ApiModel("高考资讯：大学类别信息")
public class CollegeInfoVo {
    @ApiModelProperty("是否双一流")
    private Boolean isDoubleFirst;

    @ApiModelProperty("是否重点院校")
    private Boolean isKey;

    @ApiModelProperty("是否本科院校")
    private Boolean isUndergraduate;

    @ApiModelProperty("是否艺术类院校")
    private Boolean isArt;

}
