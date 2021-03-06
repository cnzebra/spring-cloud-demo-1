package com.zzqfsy.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by john on 16-10-17.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class EurekaServerApplication {

    /*@Bean
    DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(){
        return new DiscoveryClient.DiscoveryClientOptionalArgs();
    }*/

    public static void main(String[] args) {
        //SpringApplication.run(EurekaServerApplication.class, args);
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}

