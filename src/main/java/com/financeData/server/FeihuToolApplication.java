package com.financeData.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FeihuToolApplication extends SpringBootServletInitializer{

    /**
     * 重写configure方法，加载启动类
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FeihuToolApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(FeihuToolApplication.class, args);
	}

}
