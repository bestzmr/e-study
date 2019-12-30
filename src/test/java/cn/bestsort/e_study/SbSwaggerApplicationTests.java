package cn.bestsort.e_study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbSwaggerApplicationTests {

    @Test
    public void contextLoads() {
        StringBuilder sql = new StringBuilder();
        String title = "文章标题";
        String desc = "文章内容";
        String editor = "编者";
        String author = "作者";
        for (int i = 0; i < 50; i++) {
            sql.append(String.format("insert into teacher_show (title, description, editor, author) VALUES\n" +
                    "('%s-%d','%s-%d','%s%d','%s%d');\n",
                    title,i,
                    desc,i,
                    editor,i,
                    author,i));
        }
        System.out.println();
    }

}
