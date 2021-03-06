package com.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.domain.Cidade;

@Repository
public interface CIdadeRepository  extends JpaRepository<Cidade, Integer>{

}