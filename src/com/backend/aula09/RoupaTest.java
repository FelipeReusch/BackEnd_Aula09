package com.backend.aula09;

import com.backend.aula09.model.Roupa;
import com.backend.aula09.model.Tamanho;
import com.backend.aula09.model.Tipo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoupaTest {

    Roupa roupa01;
    Roupa roupa02;
    Roupa roupa03;
    RoupaFactory factory;
    List<Roupa> cart;

    @BeforeEach
    void doBefore(){
        factory = new RoupaFactory();
        cart = new ArrayList<>();
        roupa01 = factory.getRoupa(Tamanho.M, Tipo.CALCA,true, true);
        roupa02 = factory.getRoupa(Tamanho.XS, Tipo.CAMISA, false, true);
        roupa03 = factory.getRoupa(Tamanho.S,Tipo.CAMISA,true, false);
    }

    @Test
    void getTipo(){
        assertEquals(new Roupa(Tamanho.M,Tipo.CALCA,true,true).toString(),roupa01.toString());
    }

    @Test
    void getFactory(){
        cart.add(roupa01);
        cart.add(roupa02);
        cart.add(roupa03);


        assertEquals(java.util.Optional.of(2),factory.getContador());
    }


}
