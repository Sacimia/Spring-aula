package com.senai.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.repositories.EnderecoRepository;
import com.senai.repositories.ClienteRepository;
import com.senai.repositories.CIdadeRepository;
import com.senai.services.exception.ObjectNotFound;
import com.senai.domain.Cliente;
import com.senai.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired 
	private EnderecoRepository enderecorepository;
	
	@Autowired 
	private CIdadeRepository cidaderepository;
	
	@Autowired 
	private ClienteRepository clienterepository;
	
	public Endereco buscar (Integer id){
		Optional<Endereco> obj = enderecorepository.findById(idEndereco);
		return obj.orElseThrow(()-> new ObjectNotFound("Número do id não encontrado. " + "Id: " + idEndereco + ", tipo: " + Endereco.class.getName()));
	};
	//Busca pelo todos
	public List<Endereco> findAll(){
		return clienterepository.findAll();
	}
}
