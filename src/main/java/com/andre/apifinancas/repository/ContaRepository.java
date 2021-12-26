package com.andre.apifinancas.repository;

//import com.andre.apifinancas.model.Usuario;
import com.andre.apifinancas.model.Conta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
    
}
