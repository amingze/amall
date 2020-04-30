package cn.aminga.shop.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "cn.aminga.shop")
//@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"cn.aminga.shop.commons.dao", "cn.aminga.shop.commons.domain"})
@EntityScan("cn.aminga.shop.commons.domain")
//@PropertySource("cn.shop")
public class RegApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegApplication.class, args);
    }

}
