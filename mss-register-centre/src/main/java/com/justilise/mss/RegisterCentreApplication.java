package com.justilise.mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.justilise.mss: Register centre server based on Eureka
 * <p>
 * Date: 24/02/2018 Time: 11:35 AM
 *
 * @author Created by benli
 * @see [CLASS/METHOD](Optional)
 * @since [PRODUCT/MODULE_VERSION](Optional)
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class RegisterCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCentreApplication.class, args);
    }
}
