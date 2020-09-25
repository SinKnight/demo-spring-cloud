package com.sinknight.springcloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author k+
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDemoApplication.class, args);
	}

}
