
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class Fornecedor {
    
    public static void main(String[] args) {
        //O SUPPLIER NAO RECEBE NENHUM VALOR COMO PARAMETRO, SENDO OBRIGATORIO OS PARENTESES.
        Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
            
        System.out.println(umLista.get());
    }
    
}
