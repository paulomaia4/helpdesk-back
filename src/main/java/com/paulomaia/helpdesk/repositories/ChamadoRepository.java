package com.paulomaia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomaia.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
