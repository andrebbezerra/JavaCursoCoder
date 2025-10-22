/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observer;

/**
 *
 * @author andre
 */
public class Namorada implements ObservadorChegadaAniversariante{

    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("e... Surpresa!!!");
    }
    
    
    
}
