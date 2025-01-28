package lambdas;

import java.util.function.Function;

/**
 *
 * @author andre
 */
public class Funcao {
    
    public static void main(String[] args) {
        //INTERFACE FUNCIONAL QUE RECEBE UM INTEIRO E RETORNA UM STRING
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "impar";
        
        System.out.println(parOuImpar.apply(33));
        
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado = valor -> valor + "!!!";
        
        //O USO DO andThen SERVE PARA CHAMAR OUTRA FUNCAO E O apply SERVE PARA PASSAR O PARAMETRO PARA A FUNÇÃO
        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        
        
        System.out.println(resultadoFinal);
    }
    
}
