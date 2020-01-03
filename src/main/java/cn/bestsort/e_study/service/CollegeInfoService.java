package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.AdmissionInfoMapper;
import cn.bestsort.e_study.mapper.CollegeInfoMapper;
import cn.bestsort.e_study.pojo.dto.AdmissionInfoExample;
import cn.bestsort.e_study.pojo.dto.CollegeInfo;
import cn.bestsort.e_study.pojo.dto.CollegeInfoExample;
import cn.bestsort.e_study.pojo.query.CollegeInfoQuery;
import cn.bestsort.e_study.pojo.vo.CollegeInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/31/19 2:32 PM
 */
@Service
public class CollegeInfoService {
    @Autowired
    private CollegeInfoMapper mapper;
    @Autowired
    private AdmissionInfoMapper admissionInfoMapper;
    public List<CollegeInfoVo> listCollege(CollegeInfoQuery collegeInfoVo) {
        List<CollegeInfo> lists = mapper.selectByExample(new CollegeInfoExample());
        List<CollegeInfo> schools = new LinkedList<>();
        List<CollegeInfoVo> result = new LinkedList<>();
        for (CollegeInfo list : lists) {
            if (collegeInfoVo.queryArgEquals(list)){
                schools.add(list);
            }
        }

        AdmissionInfoExample example = new AdmissionInfoExample();
        CollegeInfoVo vo = new CollegeInfoVo();

        for (CollegeInfo collegeInfo:schools){
            example.createCriteria()
                    .andIsCollegeEqualTo((byte)1)
                    .andSchoolYearBetween(collegeInfoVo.getBeginYear(),collegeInfoVo.getEndYear())
                    .andSchoolIdEqualTo(collegeInfo.getId());

            vo.setAdmissionInfos(admissionInfoMapper.selectByExample(example));
            vo.setCollegeInfo(collegeInfo);
            result.add(vo);
            example.clear();
        }
        return result;
    }

    public List<String> listArea() {
        List<CollegeInfo> list = mapper.selectByExample(new CollegeInfoExample());
        Set<String> buf = new HashSet<>();
        for (CollegeInfo collegeInfo : list) {
            buf.add(collegeInfo.getArea());
        }
        return new ArrayList<>(buf);
    }
}
