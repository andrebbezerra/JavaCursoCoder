/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author andre
 */
public class Carro {
    
    int velocidadeAtual;
    
    void acelerar(){
        velocidadeAtual += 5;
    }
    void frear(){
        if(velocidadeAtual >= 5){
             velocidadeAtual -= 5;  
        }
        else{
            velocidadeAtual = 0;
        }
    }
}
