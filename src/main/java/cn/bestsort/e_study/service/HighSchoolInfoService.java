package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.HighSchoolInfoMapper;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfo;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfoExample;
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

    public PageInfo<HighSchoolInfo> listHighSchools(int pageNo, int pageSize,String area) {
        HighSchoolInfoExample example = new HighSchoolInfoExample();
        PageHelper.startPage(pageNo,pageSize);
        if (!area.isEmpty()){
            example.createCriteria().andAreaEqualTo(area);
        }
        return new PageInfo<>(mapper.selectByExample(example));
    }

    public HighSchoolInfo getHighSchoolDetail(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<String> getAllHighSchoolArea() {
        Set<String> result = new HashSet<>();
        List<HighSchoolInfo> list = mapper.selectByExample(new HighSchoolInfoExample());
        for (HighSchoolInfo highSchoolInfo : list) {
            result.add(highSchoolInfo.getArea());
        }
        return new ArrayList<>(result);
    }

}
