package com.zslin;

import com.zslin.filter.AccessFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by zsl-pc on 2016/8/24.
 * @SpringCloudApplication就相当于@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
 * */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class RootApplication {

    public static void main(String [] args) {
//        SpringApplication.run(RootApplication.class, args);
        new SpringApplicationBuilder(RootApplication.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
