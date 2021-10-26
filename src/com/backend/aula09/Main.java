package com.backend.aula09;

import com.backend.aula09.model.Roupa;
import com.backend.aula09.model.Tamanho;
import com.backend.aula09.model.Tipo;

public class Main {

    public static void main(String[] args) {

        RoupaFactory factory = new RoupaFactory();
        Roupa roupa01 = factory.getRoupa(Tamanho.M, Tipo.CALCA,true, true);
        Roupa roupa02 = factory.getRoupa(Tamanho.XS, Tipo.CAMISA, false, true);

        System.out.println(roupa01.toString());
        System.out.println(roupa02.toString());
    }
}
