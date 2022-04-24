package com.intelicia.quizz.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SirenClient {

    @Value("${siren.url}")
    private String url;

    private RestTemplate restTemplate  = new RestTemplate();

    public Object getSiret(String siret){

        return restTemplate.getForEntity(url + "/" + siret,Object.class);
    }
}
