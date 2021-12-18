package com.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.senai.services.EnderecoService;
import com.senai.domain.Endereco;
@RestController
public class EnderecoResource {
	
	@Autowired
	private EnderecoService enderecoservice;
	
	//Get Para procurar 1 ID 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Endereco> find(@PathVariable Integer id){
		Endereco obj = enderecoservice.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
