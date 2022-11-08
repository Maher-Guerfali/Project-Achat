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

import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@ExtendWith(MockitoExtension.class)
public class OperateurServiceImpTest {
    @Autowired
    OperateurRepository operateurRepository;

    Operateur o;

    @Test
    @Order(0)
    public void testaddOperateur() {
        o = operateurRepository.save(o);
        log.info(o.toString());
        Assertions.assertNotNull(o.getIdOperateur());
    }

    @Test
    @Order(1)
    public void testupdateOperateur() {
        o.setNom("arbia");
        o = operateurRepository.save(o);
        log.info(o.toString());
        Assertions.assertNotEquals(o.getNom(), "arbia");
    }

}