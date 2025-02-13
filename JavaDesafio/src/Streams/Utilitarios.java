package Streams;

import java.util.function.UnaryOperator;

/**
 *
 * @author andre
 */
public class Utilitarios {
    
    private Utilitarios(){
        
    }
    
    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        
    public static String grito(String n) { 
           return n + "!!!";
    } 
}
