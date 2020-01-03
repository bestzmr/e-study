package cn.bestsort.e_study;

import cn.bestsort.e_study.utils.GenerateSqlUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

import static com.google.common.collect.Lists.newArrayList;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SbSwaggerApplicationTests {
    @Value("${swagger.base-package}")
    private String basePackage;
    @Test
    public void contextLoads() {
        Integer total = 20;
        StringBuilder res = new StringBuilder();
        Method[] methods = GenerateSqlUtil.class.getDeclaredMethods();
        try {
            for (Method method : methods) {
                if (method.toString().startsWith("public")){
                    try {
                        res.append(method.invoke(null, total));
                    }catch (Exception ignore){}
                }

            }
        }catch (Exception e){
            log.error(e.toString());
        }
        GenerateSqlUtil.generateHighSchoolSql(1);
    }

}
