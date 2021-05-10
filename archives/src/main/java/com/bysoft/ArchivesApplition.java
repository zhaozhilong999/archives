package com.bysoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bysoft.mapper")
public class ArchivesApplition {

    public static void main(String[] args) {
        SpringApplication.run(ArchivesApplition.class,args);
    }
}
