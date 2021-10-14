package com.andre.apifinancas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.andre.apifinancas.controller.dto.UsuarioRs;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    public List<UsuarioRs> findAll(){
        return null;
    }
}
