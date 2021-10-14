package com.andre.apifinancas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import com.andre.apifinancas.controller.dto.UsuarioRq;
import com.andre.apifinancas.controller.dto.UsuarioRs;
import com.andre.apifinancas.model.Usuario;
import com.andre.apifinancas.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    private final UsuarioRepository usuarioRepository;
    
    //essa classe evita a notação @Autowired na declaração de usuarioRepository
    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/")
    public List<UsuarioRs> findAll(){
        var usuarios = usuarioRepository.findAll();
        return usuarios
                .stream()
                .map(UsuarioRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsuarioRs findById(@PathVariable("id") Long id) {
        var usuario = usuarioRepository.getById(id);
        return UsuarioRs.converter(usuario);
    }

    @PostMapping("/")
    public void saveUsuario(@RequestBody UsuarioRq usuario){
        var u = new Usuario();
        u.setNome(usuario.getNome());
        u.setEmail(usuario.getEmail());
        usuarioRepository.save(u);
    }

    @PutMapping("/{id}")
    public void updateUsuario(@PathVariable("id") Long id,@RequestBody UsuarioRq usuario) throws Exception{
        var us = usuarioRepository.findById(id);

        if(us.isPresent()){
            var u = us.get();
            u.setNome(usuario.getNome());
            u.setEmail(usuario.getEmail());
            usuarioRepository.save(u);
        } else {
            throw new Exception("Usuário não encontrado");
        }

    }
}
