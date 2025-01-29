package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class ImprimindoObjetos {
    public static void main(String[] args) {
         
        List<String> aprovados = Arrays.asList("Lu","Gui","Luca","Ana");
        
        //MANEIRA MAIS ANTIGA DE FAZER O FOR PERCORRER A LISTA
        for (int i = 0; i < aprovados.size();i++){
            System.out.println(aprovados.get(i));
        }
        System.out.println("Usando o Foreach...");
        //MANEIRA MAIS OTIMIZADA, USANDO FOREACH
        for(String nome: aprovados){
            System.out.println(nome);
        }
        
        System.out.println("Usando o Iterator...");
        
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Usando Stream...");
        Stream<String> stream = aprovados.stream();   
        stream.forEach(System.out::println);
    }
    
}
