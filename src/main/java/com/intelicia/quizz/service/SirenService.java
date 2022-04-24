package com.intelicia.quizz.service;

import com.intelicia.quizz.client.SirenClient;
import com.intelicia.quizz.dto.SiretDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SirenService {
    @Autowired
    private SirenClient sirenClient;

    public Object getSirenClient(SiretDTO siretDTO){
        return sirenClient.getSiret(siretDTO.getId());
    }
}
