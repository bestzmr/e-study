package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.AdmissionInfoMapper;
import cn.bestsort.e_study.mapper.HighSchoolInfoMapper;
import cn.bestsort.e_study.pojo.dto.AdmissionInfoExample;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfo;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfoExample;
import cn.bestsort.e_study.pojo.vo.HighSchoolVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/30/19 4:01 PM
 */
@Service
public class HighSchoolInfoService {
    @Autowired
    private HighSchoolInfoMapper mapper;
    @Autowired
    private AdmissionInfoMapper admissionInfoMapper;
    public PageInfo<HighSchoolInfo> listHighSchools(int pageNo, int pageSize, String area) {
        HighSchoolInfoExample example = new HighSchoolInfoExample();
        PageHelper.startPage(pageNo,pageSize);
        if (!area.isEmpty()){
            example.createCriteria().andAreaEqualTo(area);
        }
        return new PageInfo<>(mapper.selectByExample(example));
    }

    public HighSchoolVo getHighSchoolDetail(Long id,int begin,int end) {
        HighSchoolVo res = new HighSchoolVo();
        res.setHighSchoolInfo(mapper.selectByPrimaryKey(id));
        AdmissionInfoExample example = new AdmissionInfoExample();
        if (id != null) {
            example.createCriteria()
                    .andSchoolIdEqualTo(id)
                    .andSchoolYearBetween(begin, end);
        }
        res.setAdmissionInfos(admissionInfoMapper.selectByExample(example));

        return res;
    }

    public List<String> getAllHighSchoolArea() {
        Set<String> result = new HashSet<>();
        List<HighSchoolInfo> list = mapper.selectByExample(new HighSchoolInfoExample());
        for (HighSchoolInfo highSchoolInfo : list) {
            result.add(highSchoolInfo.getArea());
        }
        return new ArrayList<>(result);
    }

    public List<HighSchoolInfo> listHighSchools() {
        return mapper.selectByExample(new HighSchoolInfoExample());
    }
}
