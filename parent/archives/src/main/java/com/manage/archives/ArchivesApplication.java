package com.manage.archives;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.manage.archives.mapper")
public class ArchivesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArchivesApplication.class,args);
    }
}
