package cn.bestsort.e_study.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;


/**
 * @Author zhaoqiang
 * @Date 2019/12/30 9:41
 */
@Slf4j
@Configuration
public class WebMvcConfig {
    @EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        log.info("应用已经准备就绪 ... 启动浏览器");
        String url = "http://localhost:8080/web/index";
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
