package com.saveservice.saveservice.rest;

import com.saveservice.saveservice.model.Registro;
import com.saveservice.saveservice.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RegistroREST {
    @Autowired
    private RegistroService registroService;

    @PostMapping
    private String saveRegistro(@RequestBody Registro registro){
        registroService.save(registro);
        return "save";
    }
}
