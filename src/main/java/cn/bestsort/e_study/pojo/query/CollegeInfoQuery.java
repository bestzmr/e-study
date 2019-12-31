package cn.bestsort.e_study.pojo.query;

import cn.bestsort.e_study.pojo.dto.CollegeInfo;
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
@ApiModel("高考资讯:大学查询 实体(使用本实体并通过GET查询数据)")
public class CollegeInfoQuery {
    @ApiModelProperty("是否双一流")
    private Boolean isDoubleFirst;

    @ApiModelProperty("是否重点院校")
    private Boolean isKey;

    @ApiModelProperty("是否本科院校")
    private Boolean isUndergraduate;

    @ApiModelProperty("是否艺术类院校")
    private Boolean isArt;



    @ApiModelProperty("获取区间 [beginYear,endYear] 的录取信息, 不填默认为beginYear = 2017年")
    private Integer beginYear = 2017;

    @ApiModelProperty("获取区间 [beginYear,endYear] 的录取信息, 不填默认为beginYear = 2019年")
    private Integer endYear = 2019;
    /**
     * 判断两边参数是否一致
     * @param item 要比较的对象
     * @return bool
     */
    public boolean queryArgEquals(CollegeInfo item){
        try{
            assert isDoubleFirst == null || isDoubleFirst.equals(item.getIsDoubleFirst().intValue() == 1);
            assert isKey == null || isKey.equals(item.getIsKey().intValue() == 1);
            assert isUndergraduate == null || isUndergraduate.equals(item.getIsUndergraduate() == 1);
            assert isArt == null || isArt.equals(item.getIsArt().intValue() == 1);
            return true;
        }catch (Exception ignore){return false;}
    }
}
