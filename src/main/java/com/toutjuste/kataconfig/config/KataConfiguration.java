package com.toutjuste.kataconfig.config;

import com.toutjuste.kataconfig.service.KataConfigService;
import com.toutjuste.kataconfig.service.KataConfigServiceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties
public class KataConfiguration {

    @Bean
    @ConfigurationProperties
    public HttpComponentsClientHttpRequestFactory kataHttpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory();
    }

    @Bean
    public RestTemplate kataRestTemplate() {
        return new RestTemplate(kataHttpRequestFactory());
    }

    @Bean
    public KataConfigService kataService() {
        return new KataConfigServiceImpl();
    }

}
