package com.andre.apifinancas.controller;


import java.util.List;


import com.andre.apifinancas.model.Conta;
import com.andre.apifinancas.repository.ContaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/contas")
//@CrossOrigin(origins="*")
public class ContaController {
    

    @Autowired
    ContaRepository contaRepository;

    @GetMapping("/contas")

    public List<Conta> listaContas(){
        return contaRepository.findAll();
    }
/*
    @GetMapping("/conta/{id}")
    public Conta listaContaPeloID(@PathVariable(value="id_conta") long id){
        return contaRepository.findById(id);
    }
*/
    @PostMapping("/conta")
    public Conta salvarConta(@RequestBody Conta conta){
        return contaRepository.save(conta);
    }

    @DeleteMapping("/conta")
    public void deletarConta(@RequestBody Conta conta){
        contaRepository.delete(conta);
    }

    @PutMapping("/conta")
    public Conta atualizarConta(@RequestBody Conta conta){
        return contaRepository.save(conta);
    }

}