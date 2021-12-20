package com.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senai.repositories.CIdadeRepository;
import com.senai.services.CidadeService;
import com.senai.domain.Cidade;


@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {
	@Autowired 
	private CidadeService cidser;
	
	//GET para pegar 1 ID 
	@RequestMapping(value = "/{id}",  method = RequestMethod.GET)
	public ResponseEntity<Cidade> find(@PathVariable Integer id){
		Cidade obj = cidser.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
