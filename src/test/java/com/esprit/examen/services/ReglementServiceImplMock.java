package com.esprit.examen.services;

import com.esprit.examen.entities.Role;
import com.esprit.examen.entities.Reglement;
import com.esprit.examen.repositories.ReglementRepository;
import com.esprit.examen.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class ReglementServiceImplMock {



    @Mock
    ReglementRepository reglementRepository;
// Ou
//UserRepository userRepository = Mockito.mock(UserRepository.class);

    @InjectMocks
    ReglementServiceImpl  reglementService;

    Reglement reglement = new Reglement(44, 33, true, new Date());
    List<Reglement> listUsers = new ArrayList<Reglement>() {
        {
            add(new Reglement(323, 123, true, new Date()));
            add(new Reglement(213, 112,false, new Date()));
        }
    };
    @Test
    public void retrieveReglement() {
        Mockito.when(reglementRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(reglement));
        Reglement reglement1 = reglementService.retrieveReglement(Long.valueOf("2"));
        Assertions.assertNotNull(reglement1);
    }

}