package cn.bestsort.e_study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static com.google.common.collect.Lists.newArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbSwaggerApplicationTests {
    @Value("${swagger.base-package}")
    private String basePackage;
    @Test
    public void contextLoads() {
        System.out.println(basePackage);
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, newArrayList(
                        new ResponseMessageBuilder()
                                .code(500)
                                .message("服务器发生异常")
                                .responseModel(new ModelRef("Error"))
                                .build(),
                        new ResponseMessageBuilder()
                                .code(403)
                                .message("资源不可用")
                                .build()
                ));
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
