package com.hero.cat.config;

import com.hero.cat.Interceptor.MyInterceptor;
import com.hero.cat.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @SuppressWarnings("unused")
    @Autowired
    private com.hero.cat.Interceptor.MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor);
    }


    @Bean
    public FilterRegistrationBean rigistFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        MyFilter timeFilter = new MyFilter();
        filterRegistrationBean.setFilter(timeFilter);
        return  filterRegistrationBean;
    }



}
