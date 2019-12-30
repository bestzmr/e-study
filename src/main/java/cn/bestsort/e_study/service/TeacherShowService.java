package cn.bestsort.e_study.service;

import cn.bestsort.e_study.mapper.TeacherShowMapper;
import cn.bestsort.e_study.pojo.dto.TeacherShow;
import cn.bestsort.e_study.pojo.dto.TeacherShowExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 12/30/19 10:20 AM
 */
@Service
public class TeacherShowService {
    @Autowired
    private TeacherShowMapper teacherShowMapper;

    /**
     * 获取教师风采文章列表
     * @param pageNo 起始页码
     * @param pageSize 每一页数据量
     * @return List
     */
    public List<TeacherShow>listTeacherShows(int pageNo, int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        return teacherShowMapper.selectByExample(new TeacherShowExample());
    }

    /**
     * 获取文章详情
     * @param id 文章id
     * @return 详情
     */
    public TeacherShow getTearcherShowDetail(long id){
        return teacherShowMapper.selectByPrimaryKey(id);
    }
}
