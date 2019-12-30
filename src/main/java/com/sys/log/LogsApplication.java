package com.sys.log;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAdminServer
@MapperScan(basePackages = {"com.sys.log.mapper"})
public class LogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogsApplication.class, args);
    }

}
