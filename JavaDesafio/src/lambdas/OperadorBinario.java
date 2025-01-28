/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author andre
 */
public class OperadorBinario {
    public static void main(String[] args) {
        //FUNCAO LAMBDA QUE RECEBE DOIS VALORES COMO PARAMETRO, PORÉM OS MESMOS PRECISAM SER DO MESMO TIPO 
        BinaryOperator<Double> media = (n1,n2) ->(n1 + n2) / 2;
        
        System.out.println(media.apply(9.8, 5.7));
        
        //FUNCAO LAMBDA QUE RECEBE TRES PARAMETROS E OS MESMOS PODEM SER DE TIPOS DIFERENTES
        BiFunction<Double, Double, String> resultado = (n1,n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        
        System.out.println(resultado.apply(9.7, 5.1));
        
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
    
}
