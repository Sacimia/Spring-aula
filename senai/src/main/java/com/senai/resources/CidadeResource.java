package com.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.repositories.CIdadeRepository;
import com.senai.services.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeService cidser;
	
@RequestMapping(value = "/{id}", method = RequestMethod.GET)


}