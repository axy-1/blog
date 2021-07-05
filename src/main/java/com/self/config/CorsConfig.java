package com.self.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author axy
 * @create 2021-07-05 13:05
 * 解决跨域问题
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("/*")
                    .allowedMethods("GET","POST","HEAD","PUT","DELETE","OPTIONS")
                    .allowCredentials(true)
                    .maxAge(3600)
                    .allowedHeaders("/*");
    }
}
