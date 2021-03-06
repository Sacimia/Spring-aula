package com.senai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.senai.domain.Estado;
import com.senai.repositories.EstadoRepository;
import com.senai.services.exception.ObjectNotFound;

public class EstadoService {
	@Autowired 
	private EstadoRepository estrepo;
	
	public Estado buscar(Integer idEstado) {
		Optional<Estado> obj = estrepo.findById(idEstado);
		return obj.orElseThrow(() -> new ObjectNotFound("Número de id não encontrado: " + idEstado +", tipo: "+ Estado.class.getName()));			
		}
	public List<Estado> findAll(){
		return estrepo.findAll();
	}
}