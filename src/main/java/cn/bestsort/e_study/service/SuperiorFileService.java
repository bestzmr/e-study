package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.SuperiorFileMapper;
import cn.bestsort.e_study.pojo.dto.SuperiorFile;
import cn.bestsort.e_study.pojo.dto.SuperiorFileExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 1/7/20 9:47 AM
 */
@Service
public class SuperiorFileService {
    @Autowired
    private SuperiorFileMapper mapper;

    public List<SuperiorFile> listSuperiorFiles(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return mapper.selectByExample(new SuperiorFileExample());
    }


    public SuperiorFile getById(long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
