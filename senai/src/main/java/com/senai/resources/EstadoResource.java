package com.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senai.domain.Estado;
import com.senai.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	@Autowired 
	private EstadoService estser;
	
	//GET para pegar 1 ID 
	@RequestMapping(value = "/{id}",  method = RequestMethod.GET)
	public ResponseEntity<Estado> find(@PathVariable Integer id){
		Estado obj = estser.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
