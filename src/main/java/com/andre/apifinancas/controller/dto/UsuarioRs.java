package com.andre.apifinancas.controller.dto;

import com.andre.apifinancas.model.Usuario;

public class UsuarioRs {

    private Long id;
    private String nome;
    private String email;

    //converter Usuario em UsuarioRs
    public static UsuarioRs converter(Usuario u){
        var usuario = new UsuarioRs();
        usuario.setId(u.getId());
        usuario.setNome(u.getNome());
        usuario.setEmail(u.getEmail());
        return usuario;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
