package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTest {

    @Test
    public void listaMulheres(){
        Pessoa p1 = new Pessoa("Caio", "Masculino");
        Pessoa p2 = new Pessoa("João", "Masculino");
        Pessoa p3 = new Pessoa("Maria", "Feminino");
        Pessoa p4 = new Pessoa("Camilla", "Feminino");

        List<Pessoa> lista = List.of(p1, p2, p3, p4);       //lista de todas pessoas

        List<Pessoa> listaMulheres = lista.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino")).collect(Collectors.toList());

        for (Pessoa pessoa: listaMulheres) {        //Verifica se cada Pessoa da lista é do sexo feminino
            Assert.assertEquals("Feminino", pessoa.getSexo());
        }
    }

}
