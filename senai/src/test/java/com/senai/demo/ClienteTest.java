package com.senai.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.senai.domain.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import com.senai.repositories.ClienteRepository;
import com.senai.domain.Cliente;

@SpringBootTest
public class ClienteTest {
	@Autowired
	private ClienteRepository clirepo;
	
	@Test 
	public void Cliente () {
		Cliente cli = new Cliente();
		cli.setIdCliente(null);
		cli.setNome("Maquinobaldo");
		cli.setCpfouCnpj("12010288800");
		cli.setEmail("maquinobaldo@maquinobaldo.com.br");
		clirepo.save(cli);
	}
	
	@Test
	public void listaCliente() {
		List<Cliente> List = clirepo.findAll();
		assertThat(List).size().isGreaterThan(0);
	}
	
	@Test
	public void IdCliente(){
		List<Cliente> List = clirepo.findById(1).get();
		assertThat(List).size().isGreaterThan(0);
	}
	
	@Test
	public void updateCliente(){
		Cliente cli = clirepo.findById(null).get();
	}
	
	@Test
	public void deleteCliente(){
		clirepo.deleteById(2);
		assertThat(clirepo.existsById(2));
	}
	@Test
	public void somar(){
		double num1 = 5.00;
		double num2 = 10.00;
		Cliente cliente= new Cliente();
		double soma =  cliente.somar(5.00,10.00);
		assertEquals(15, soma);
				
	}
}
