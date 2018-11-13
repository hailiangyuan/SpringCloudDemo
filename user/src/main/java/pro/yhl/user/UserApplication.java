package pro.yhl.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages =  "pro.yhl.user.dao.*")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
