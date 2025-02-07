package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author andre
 */
public class DesafioFilter {
    public static void main(String[] args) {
        
         Produto p1 = new Produto(1, "Lapis", 1.99, 0.35, 0.00);
    Produto p2 = new Produto(1, "Notebook", 4899.89, 0.32, 0.00);
    Produto p3 = new Produto(1, "Caderno", 30.00, 0.45, 0.00);
    Produto p4 = new Produto(1, "Impressora", 1200.00, 0.40, 0.00);
    Produto p5 = new Produto(1, "IPad", 3100.00, 0.29, 0.00);
    Produto p6 = new Produto(1, "Relogio", 1900.00, 0.12, 0.00);
    Produto p7 = new Produto(1, "Monitor", 800.00, 31.00, 0.00);
    
    List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
    
    Predicate<Produto> maiorDesconto = p -> p.desconto >= 0.3;
    Predicate<Produto> freteGratis = p -> p.valorFrete == 0.00;
    Predicate<Produto> produtoRelevante = p -> p.preco >= 500.00;
    
    Function<Produto, String> chamadaPromocional = p -> "O Produto "+ p.descricao + " Está em Promoção!!";
        
       produtos.stream()
               .filter(maiorDesconto)
               .filter(freteGratis)
               .filter(produtoRelevante)
               .map(chamadaPromocional)
               .forEach(System.out::println);   
        
    }   
}
