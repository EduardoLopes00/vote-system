package com.testdbserver.desafiovotacao.web.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    private AssociateDTO associateDTO;
    private String token;
}
