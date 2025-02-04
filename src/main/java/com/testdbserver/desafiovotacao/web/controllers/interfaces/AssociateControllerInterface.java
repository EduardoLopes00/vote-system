package com.testdbserver.desafiovotacao.web.controllers.interfaces;

import com.testdbserver.desafiovotacao.data.models.Associate;
import com.testdbserver.desafiovotacao.web.DTO.AssociateDTO;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface AssociateControllerInterface {
    public ResponseEntity<Associate> getById(UUID id);
}
