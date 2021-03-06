package com.senai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.domain.Cidade;
import com.senai.repositories.CIdadeRepository;
import com.senai.services.exception.ObjectNotFound;

@Service
public class CidadeService {
	
	@Autowired 
	private CIdadeRepository cidrepo;
	
	public Cidade buscar(Integer idCidade) {
		Optional<Cidade> obj = cidrepo.findById(idCidade);
		return obj.orElseThrow(() -> new ObjectNotFound("Número de id não encontrado: " + idCidade +", tipo: "+ Cidade.class.getName()));			
		}
	
	public List<Cidade> findAll(){
		return cidrepo.findAll();
	}
}	
	