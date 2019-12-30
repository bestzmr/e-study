package cn.bestsort.e_study.mapper;

<<<<<<< HEAD
/**
 * @Author zhaoqiang
 * @Date 2019/12/30 8:55
 */
public interface UserMapper {
}
=======
import cn.bestsort.e_study.dto.User;
import cn.bestsort.e_study.dto.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
>>>>>>> origin/master
