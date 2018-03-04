package com.justilise.mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * com.justilise.mss: TODO input functional description here
 * <p>
 * Date: 03/03/2018 Time: 5:06 PM
 *
 * @author Created by benli
 * @see [CLASS/METHOD](Optional)
 * @since [PRODUCT/MODULE_VERSION](Optional)
 */
@Configuration
@EnableEurekaClient
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
