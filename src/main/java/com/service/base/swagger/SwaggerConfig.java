package com.service.base.swagger;

import com.scottxuan.web.swagger.AbstractSwaggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : zhaoxuan
 * @date : 2020/6/23
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends AbstractSwaggerConfig {

    private static final String BASE_PACKAGE = "com.service.base.api";
    private static final String TITLE = "SERVICE-BASE Restful API Docs";
    private static final String DESCRIPTION = "SERVICE-BASE Restful API Docs";
    private static final String VERSION = "2.0";

    @Bean
    @Override
    public Docket createRestApi() {
        return super.createRestApi();
    }

    @Override
    protected String getBasePackage() {
        return BASE_PACKAGE;
    }

    @Override
    protected String getTitle() {
        return TITLE;
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION;
    }

    @Override
    protected String getVersion() {
        return VERSION;
    }
}
