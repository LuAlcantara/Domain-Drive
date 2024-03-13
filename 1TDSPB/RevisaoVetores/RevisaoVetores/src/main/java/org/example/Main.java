package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println("Tamanho da lista: " + arr.length);
//        System.out.println("Primeiro elemento: " + arr[0]);
//
//        //vazio x 0
//        int[] arr2 = null; // vc nem tem sacola
//        arr2 = new int[] {}; // vc tem uma sacola com 0 itens
//
//        String[] ListaDeAlunos = {"Lucas","José", "Mariana","Renan"};

        //Lista mutavel
        var ListaDeAlunos = new ArrayList<Aluno>();
        ListaDeAlunos.add(new Aluno("teste", 19, "456897"));
        ListaDeAlunos.add(new Aluno("Lucas", 19, "456897"));
        ListaDeAlunos.add(new Aluno("Lucas", 19, "456897"));
        ListaDeAlunos.add(new Aluno("Lucas", 19, "456897"));
        ListaDeAlunos.add(new Aluno("José", 23, "765390"));
        ListaDeAlunos.add(new Aluno("Mario", 18, "780512"));
        ListaDeAlunos.add(new Aluno("Beatriz", 25, "459123"));

        //jeito novo
        // stream api é um recurso que permite manipular coleções de dados
        // de forma mais simples e eficiente
        // filter, map, distinct, sorted, limit, skip, forEach
        // 1. filtrar alunos com mais de 20 anos
        // 2. ordenar por nome
        // 3. remover duplicados
        // 4. pular o primeiro aluno
        // 5. limitar a 3 alunos
        // 6. imprimir os alunos

        var ListaNova = ListaDeAlunos.stream()
                .filter(aluno -> aluno.getIdade() > 20)
                .sorted(Comparator.comparing(Aluno::getNome))
                .distinct()
                //.skip(1)
                //.limit(3)
                .map(Aluno::getIdade).toList();
                //.forEach(System.out::println);

        //ListaNova.forEach(System.out::println);
        System.out.println(ListaNova.stream().mapToInt(Integer::intValue).sum());

        //jeito antigo
        /*
        var ListaDeAlunosComMaisDe20Anos = new ArrayList<Aluno>();
        for(Aluno aluno : ListaDeAlunos)
            if(aluno.getIdade() > 20){
                ListaDeAlunosComMaisDe20Anos.add(aluno);
        ListaDeAlunosComMaisDe20Anos.forEach(System.out::println);*/


        //Lista imutavel
        var documentosAceitos = Arrays.asList("RG", "CPF", "CNH", "PASSAPORTE");




    }
}