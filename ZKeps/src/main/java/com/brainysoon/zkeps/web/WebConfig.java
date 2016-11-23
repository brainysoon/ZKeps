package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.service.KepsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;

/**
 * Created by ken on 16-10-12.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {WebConfig.class, KepsRepository.class, KepsService.class})
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final String CSS_LOCATION = "/resources/css/**";
    private static final String JS_LOCATION = "/resources/js/**";
    private static final String IMAGES_LOCATION = "/resources/images/**";

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();
    }

    @Bean
    public MultipartResolver multipartResolver() throws IOException {

        return new StandardServletMultipartResolver();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(CSS_LOCATION).addResourceLocations(CSS_LOCATION);
        registry.addResourceHandler(JS_LOCATION).addResourceLocations(JS_LOCATION);
        registry.addResourceHandler(IMAGES_LOCATION).addResourceLocations(IMAGES_LOCATION);
    }
}
