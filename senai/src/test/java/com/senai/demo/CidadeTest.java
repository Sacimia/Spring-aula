package com.senai.demo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.senai.domain.Cidade;
import com.senai.repositories.CIdadeRepository;


public class CidadeTest  {
	
	
	@Autowired
	private CIdadeRepository cidrepo;
	@Autowired
	private Cidade cid;	
	
	@Test
	public void listaCidade() {
		
	}
	
	@Test
	public void updateCidade() {
		Cidade cid = cidrepo.findById(1).get();
		cid.setName();
		cidrepo.save(null);
		assertNotEquals(null, null);
	}
	
}
