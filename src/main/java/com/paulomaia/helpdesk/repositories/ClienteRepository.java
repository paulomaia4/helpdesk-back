package com.paulomaia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomaia.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
