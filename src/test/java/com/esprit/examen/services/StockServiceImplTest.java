package com.esprit.examen.services;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.StockRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@ExtendWith(MockitoExtension.class)
public class StockServiceImplTest {
	@Autowired
	StockRepository stockRepository;
	
	Stock s;
	
	@Test
	@Order(0)
	public void testAddStock() {
	s = stockRepository.save(s);
	log.info(s.toString());
	Assertions.assertNotNull(s.getIdStock());
	} 
	
	@Test
	@Order(1)
	public void testmodifierStock() {
	s.setLibelleStock("test");
	s = stockRepository.save(s);
	log.info(s.toString());
	Assertions.assertNotEquals(s.getLibelleStock(), "test");
	} 
	
	@Test
	@Order(2)
	public void testcompterStock() {
	long taille = stockRepository.count();
	Assertions.assertEquals(taille, stockRepository.findAll().size());
	} 
}