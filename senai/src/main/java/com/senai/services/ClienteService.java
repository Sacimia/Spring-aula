package com.senai.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.domain.Cliente;
import com.senai.repositories.ClienteRepository;
import com.senai.services.exception.ObjectNotFound;

@Service
public class ClienteService {
	
	@Autowired 
	private ClienteRepository clirepo;
	
	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = clirepo.findById(idCliente);
		return obj.orElseThrow(() -> new ObjectNotFound("Número de id não encontrado: " + idCliente +", tipo: "+ Cliente.class.getName()));			
		}
	
	public List<Cliente> findAll(){
		return clirepo.findAll();
	}
}	
/*	//Busca todos os clientes
	public List<Endereco> findAll(){
		return end.findAll();
	}
	
	
	//Recebe o Post e poem na base de dados 
	public Cliente insert(Cliente obj) {
		obj.setIdCliente(null);
		obj = cli.save(obj);
		enderecorepository.saveAll(obj.getEnderecos());
		return obj;
	}
	
	//Atualizações 
	
	public Cliente update (Cliente obj) {
		//a mesma funcao busca da mesma classe.
		buscar(obj.getIdCliete());
	}
}
*/