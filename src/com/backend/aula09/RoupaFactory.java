package com.backend.aula09;

import com.backend.aula09.model.Roupa;
import com.backend.aula09.model.Tamanho;
import com.backend.aula09.model.Tipo;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {

    private static Map<String, Roupa> flyweight = new HashMap<>();
    private static Integer contador = 0;

    public Roupa getRoupa(Tamanho tamanho, Tipo tipo, boolean eNovo, boolean importada) {
        String id = String.format("tamanho:%stipo:%snova:%simportada:%s", tamanho,tipo,eNovo,importada);

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Roupa(tamanho, tipo,eNovo, importada));
            contador++;
        }
        return flyweight.get(id);
    }


    public Integer getContador() {
        return contador;
    }

}
