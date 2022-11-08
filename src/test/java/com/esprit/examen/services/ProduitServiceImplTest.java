package com.esprit.examen.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@ExtendWith(MockitoExtension.class)
public class ProduitServiceImplTest {
	@Autowired
	ProduitRepository produitRepository;
	
	Produit p;
	
	
	
	@Test
	@Order(0)
	public void testaddProduit() {
	p = produitRepository.save(p);
	log.info(p.toString());
	Assertions.assertNotNull(p.getIdProduit());
	} 
	
	
	@Test
	@Order(1)
	public void testcountProduit() {
	long taille = produitRepository.count();
	Assertions.assertEquals(taille, produitRepository.findAll().size());
	} 
	
	
	@Test
	@Order(2)
	public void testupdateProduit() {
	p.setLibelleProduit("test");
	p = produitRepository.save(p);
	log.info(p.toString());
	Assertions.assertNotEquals(p.getLibelleProduit(), "test");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}