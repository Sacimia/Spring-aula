package com.senai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senai.domain.Estado;
	
@Entity
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCidade;
	private String nome;
		
	@JsonIgnore
	@OneToMany(mappedBy = "cidades")
	private List<Estado>  estado = new ArrayList<>();
		
		public Cidade(){
			
		}
		
		public Cidade(Integer idCidade, String nome, Estado estado) {
			super();
			this.idCidade = idCidade;
			this.nome = nome;
			this.estado = estado;
		}

		public Integer getIdCidade() {
			return idCidade;
		}

		public void setIdCidade(Integer idCidade) {
			this.idCidade = idCidade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Estado> getEstado() {
			return estado;
		}

		public void setEstado(List<Estado> estado) {
			this.estado = estado;
		}
		
}
