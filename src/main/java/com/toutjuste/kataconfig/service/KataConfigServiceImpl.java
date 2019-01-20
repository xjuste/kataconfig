package com.toutjuste.kataconfig.service;

import com.toutjuste.kataconfig.model.KataConfigResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class KataConfigServiceImpl implements KataConfigService {
    private final static String serviceURL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    RestTemplate kataRestTemplate;
    // HttpComponentsClientHttpRequestFactory httpRequestFactory;

    @Override
    public List<KataConfigResponse> getData() {

//        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

        KataConfigResponse[] responses = kataRestTemplate.getForObject(serviceURL, KataConfigResponse[].class);

        return Arrays.asList(responses);
    }



}
