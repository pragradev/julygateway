package io.pragra.learning.rogersgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RogersGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RogersGatewayApplication.class, args);
    }

}
