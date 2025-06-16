/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author andre
 */
public class Match {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Fabi", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.1);
        
        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
        
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();
        
        System.out.println(alunos.stream().allMatch(aprovado));//TODAS AS ENTRADAS DO PREDICATE SÃO VERDADEIRAS
        System.out.println(alunos.stream().anyMatch(aprovado));//ALGUMAS(ALGUEM) DAS ENTRADAS DO PREDICATE SÃO VERDADEIRAS
        System.out.println(alunos.stream().noneMatch(reprovado));//NENHUMA DAS ENTRADAS DO PREDICATE SÃO VERDADEIRAS
    }  
}
