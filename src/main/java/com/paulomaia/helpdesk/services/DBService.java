package com.paulomaia.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulomaia.helpdesk.domain.Chamado;
import com.paulomaia.helpdesk.domain.Cliente;
import com.paulomaia.helpdesk.domain.Tecnico;
import com.paulomaia.helpdesk.domain.enums.Perfil;
import com.paulomaia.helpdesk.domain.enums.Prioridade;
import com.paulomaia.helpdesk.domain.enums.Status;
import com.paulomaia.helpdesk.repositories.ChamadoRepository;
import com.paulomaia.helpdesk.repositories.ClienteRepository;
import com.paulomaia.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instaciaDB() {
	
	Tecnico tec1 = new Tecnico(null, "Paulo Maia", "12345678910", "paulo@mail.com", "123");
	Tecnico tec2 = new Tecnico(null, "Pedro Maia", "68564879753", "pepeo@mail.com", "123");
	Tecnico tec3 = new Tecnico(null, "Steve Jobs", "91078945635", "steveo@mail.com", "123");
	tec1.addPerfil(Perfil.ADMIN);
	
	Cliente cli1 = new Cliente(null, "Pedro Maia", "10987654321", "pedro@mail.com", "123");
	
	Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
	
	tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3));
	clienteRepository.saveAll(Arrays.asList(cli1));
	chamadoRepository.saveAll(Arrays.asList(c1));
}
}