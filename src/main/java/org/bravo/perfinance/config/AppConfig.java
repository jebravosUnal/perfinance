package org.bravo.perfinance.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${server.port}")
    private String port;

    public String getPort() {
        return port;
    }
}
