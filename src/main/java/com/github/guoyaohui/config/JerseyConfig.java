package com.github.guoyaohui.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * jersey配置
 *
 * @author  郭垚辉
 * @date 2018-08-11
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.github.guoyaohui");
    }
}
