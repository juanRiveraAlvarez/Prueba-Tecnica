package com.saveservice.saveservice.service;

import com.saveservice.saveservice.repository.RegistroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

class RegistroServiceTest {
    @Mock
    private RegistroRepository registroRepository;

    @InjectMocks
    private  RegistroService registroService;

    private String estado;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        estado = new String();
        estado = "save";
    }

    @Test
    void save() {
        when(registroRepository.save(any())).thenReturn(estado);
        assertNotNull(registroService.save(any()));
    }
}