package com.heyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Copyright (c) 2018 by [安徽航天信息]
 *
 * @ClassName: InvoiceSysApplication
 * @Description: ${DESCRIPTION}
 * @Author: hy
 * @CreateDate: 2019-10-10 17:43
 * @LastUpdateAutor: hy
 * @LastUpdateDate: 2019-10-10 17:43
 */
@SpringBootApplication(scanBasePackages = {"com.heyang"} )
@MapperScan("com.heyang.mapper")
@ImportAutoConfiguration()
@EnableCaching
public class InvoiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceApplication.class, args);
    }
}
