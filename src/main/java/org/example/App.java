package org.example;

import java.util.List;
import java.util.stream.Collectors;


public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa("Caio", "Masculino");
        Pessoa p2 = new Pessoa("João", "Masculino");
        Pessoa p3 = new Pessoa("Maria", "Feminino");
        Pessoa p4 = new Pessoa("Camilla", "Feminino");

        List<Pessoa> lista = List.of(p1, p2, p3, p4);

        List<Pessoa> listaMulheres = lista.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino")).collect(Collectors.toList());
        System.out.println(listaMulheres);
    }
}
