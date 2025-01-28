package heranca;

/**
 *
 * @author andre
 */
public class Pista {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari();
        Carro civic = new Civic();
        
        System.out.println("Velocidade Ferrari: "+ ferrari.velocidadeAtual);
        System.out.println("Velocidade Ferrari: "+ civic.velocidadeAtual);
        
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();
        
        System.out.println("Velocidade Ferrari: "+ ferrari.velocidadeAtual);
        System.out.println("Velocidade Ferrari: "+ civic.velocidadeAtual);
    }
    
}
