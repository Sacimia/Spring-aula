package com.senai.resources;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.senai.services.ClienteService;
import com.senai.domain.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired 
    private ClienteService cliser;
	
	//GET PARA PEGAR 1 ID
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id){
		Cliente obj = cliser.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//GET PARA ENVIAR ENVIAR INFORMAÇÕES
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> listCliente = cliser.findAll();
		return ResponseEntity.ok().body(listCliente);
	}
}
