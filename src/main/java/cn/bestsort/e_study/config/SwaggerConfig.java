package cn.bestsort.e_study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;

/**
 * @author zhaoqiang
 * @date 2019/12/30
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.bestsort.e_study.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "E学网报名平台-API参考",
                "本部分所有接口均可用对应选项右上角` Try it out `测试返回数据。其中，被`[]`包裹的参数作为可选项(有默认值或者这个参数本身不是必要的)",
                "1.0",
                "e.bestsort.cn/swagger-ui.html", "", "", "");
        return apiInfo;
    }
}
