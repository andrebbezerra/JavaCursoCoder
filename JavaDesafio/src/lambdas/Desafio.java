
package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author andre
 */
public class Desafio {
    public static void main(String[] args) {
        
        //1. A partir do produto calcular o preco real(com desconto)
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        //2. Calculo de imposto Municipal
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        //3. Calculo do Frete
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        //4. Arredondar o valor para duas casas decimais
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        //5. Formatar: R$1234,56
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
        
        Produto p = new Produto("IPad", 3235.89, 0.13);
        
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar).apply(p);
        
        System.out.println("O preço final é: "+ preco);
        
    }
    
}
