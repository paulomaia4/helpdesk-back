package com.paulomaia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomaia.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
