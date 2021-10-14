package com.andre.apifinancas.controller.dto;

public class UsuarioRq {
    
    private String nome;
    private String email;

    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
