package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.HighSchoolInfoMapper;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfo;
import cn.bestsort.e_study.pojo.dto.HighSchoolInfoExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public PageInfo<HighSchoolInfo> listHighSchools(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<>(mapper.selectByExample(new HighSchoolInfoExample()));
    }

    public HighSchoolInfo getHighSchoolDetail(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
