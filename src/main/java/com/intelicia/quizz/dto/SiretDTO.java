package com.intelicia.quizz.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SiretDTO {
    private String id;
    private String nic;
    private String fullAdresse;
    private String fullName;
    private String tvaNumber;
}
