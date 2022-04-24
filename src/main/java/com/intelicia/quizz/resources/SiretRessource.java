package com.intelicia.quizz.resources;

import com.intelicia.quizz.dto.SiretDTO;
import com.intelicia.quizz.service.SirenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiretRessource {
    @Autowired
    private SirenService sirenService;

    @PostMapping("/info")
    public ResponseEntity<?> getCompanyInf(@RequestBody SiretDTO siretDTO){
        return ResponseEntity
                .ok(sirenService.getSirenClient(siretDTO));
    }


}
