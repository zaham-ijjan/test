package com.intelicia.quizz.service;

import com.intelicia.quizz.client.SirenClient;
import com.intelicia.quizz.dto.SiretDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SirenServiceTest {

    @Mock
    private SirenClient sirenClient;

    @InjectMocks
    private SirenService sirenService;

    @Test
    public void getSirenClient() {
        //given
        SiretDTO siretDTO = SiretDTO.builder()
                .id("68465464")
                .fullAdresse("adresse")
                .fullName("full name")
                .tvaNumber("6846984684")
                .build();

        Object o  = new Object();


        //when
        when(sirenClient.getSiret(anyString())).thenReturn(o);


        //then
        Object resutl = sirenService.getSirenClient(siretDTO);

        assertNotNull(o);
    }
}