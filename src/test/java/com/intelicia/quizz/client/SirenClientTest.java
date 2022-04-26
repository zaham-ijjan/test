package com.intelicia.quizz.client;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class SirenClientTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private SirenClient sirenClient;

    @Before
    public void setUp() throws Exception {
        ReflectionTestUtils.setField("sirenClient","url","https://entreprise.data.gouv.fr/api/sirene/v1/siret");
    }

    @Test
    @Ignore
    public void getSiret() {
        //given
        String siret = "6846846846584684";
        ResponseEntity o = ResponseEntity.ok(new Object());

        //when
        Mockito.when(restTemplate.getForEntity(anyString(), Object.class)).thenReturn(o);

        Object result =  sirenClient.getSiret(siret);
        //then
        assertNotNull(result);

    }
}