/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Compra {
    
    final List<Item> itens = new ArrayList<>();
    
    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }
    
   void adicionarItem(String nome, double preco, int qtde){
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }
    
    double obterValotTotal(){
        double total = 0;
        
        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
                
        return total;
    }
}
