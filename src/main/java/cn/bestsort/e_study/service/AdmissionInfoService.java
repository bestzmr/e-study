package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.AdmissionInfoMapper;
import cn.bestsort.e_study.pojo.dto.AdmissionInfo;
import cn.bestsort.e_study.pojo.dto.AdmissionInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/31/19 8:33 AM
 */

@Service
public class AdmissionInfoService {
    @Autowired
    private AdmissionInfoMapper mapper;

    public List<AdmissionInfo> listAdmissionBySchool(byte type, long id, int begin, int end) {
        AdmissionInfoExample example = new AdmissionInfoExample();
        example.createCriteria()
                .andSchoolTypeEqualTo(type)
                .andSchoolIdEqualTo(id)
                .andSchoolYearBetween(begin,end);
        return mapper.selectByExample(example);
    }
}
