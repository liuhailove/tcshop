package com.shop.tcshop.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web mvc config
 *
 * @author honggang.liu
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 允许http类型
     */
    private static final String ORIGINS[] = new String[]{"GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"};


    /**
     * 配置静态资源访问路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 静态资源访问路径和存放路径配置
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/", "classpath:/public/", "classpath:/resources/")
                .setCachePeriod(604800).resourceChain(true);
        // swagger访问配置
        //排除静态文件
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods(ORIGINS)
                .allowCredentials(true)
                .allowedHeaders("*")
                .maxAge(3600);
    }

}