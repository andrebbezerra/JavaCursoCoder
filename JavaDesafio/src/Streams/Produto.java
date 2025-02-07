package Streams;

/**
 *
 * @author andre
 */
public class Produto {
    
    final Integer codigo;
    final String descricao;
    final Double preco;
    final Double desconto;
    final Double valorFrete;

    public Produto(Integer codigo, String descricao, Double preco, Double desconto, Double valorFrete) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }    
}
