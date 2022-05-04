package com.paulomaia.helpdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.paulomaia.helpdesk.domain.Chamado;

public class ChamadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	
	
	private Integer prioridade;
	private Integer status;
	private String titulo;
	private String observacoes;
	private Integer tecnico;
	private Integer cliente;
	private String nomeTecnico;
	private String nomeCliente;
	
	public ChamadoDTO() {
		super();
		
	}

	public ChamadoDTO(Chamado obj) {
		super();
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCodigo();
		this.status = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacoes = obj.getObservacoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.nomeTecnico = obj.getTecnico().getNome();
		this.nomeCliente = obj.getCliente().getNome();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the dataAbertura
	 */
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the dataFechamento
	 */
	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	/**
	 * @param dataFechamento the dataFechamento to set
	 */
	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	/**
	 * @return the prioridade
	 */
	public Integer getPrioridade() {
		return prioridade;
	}

	/**
	 * @param prioridade the prioridade to set
	 */
	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	/**
	 * @return the tecnico
	 */
	public Integer getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	/**
	 * @return the cliente
	 */
	public Integer getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the nomeTecnico
	 */
	public String getNomeTecnico() {
		return nomeTecnico;
	}

	/**
	 * @param nomeTecnico the nomeTecnico to set
	 */
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
