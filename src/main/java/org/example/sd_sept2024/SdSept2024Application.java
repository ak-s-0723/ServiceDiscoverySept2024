package org.example.sd_sept2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SdSept2024Application {

    public static void main(String[] args) {
        SpringApplication.run(SdSept2024Application.class, args);
    }

}
