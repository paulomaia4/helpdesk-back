package com.paulomaia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomaia.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
