package com.intelicia.quizz.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class SiretDTO {
    private String id;
    private String nic;
    private String fullAdresse;
    private String fullName;
    private String tvaNumber;
}
