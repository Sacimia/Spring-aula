package com.senai.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.senai.repositories.EnderecoRepository;
import com.senai.domain.Endereco;

@SpringBootTest
public class EnderecoTest {
	
	@Autowired
	EnderecoRepository endrepo;
	
	@Test
	void Endereco() {
		Endereco end = new Endereco(); 
		end.setIdEndereco(1);
		end.setBairro("Jardins");
		end.setLogradouro("Alameda das Rosas");
		end.setNumero("12");
		end.setComplemento("");
		end.setCep("2840804");
		endrepo.save(end);
	}
	
	
}
