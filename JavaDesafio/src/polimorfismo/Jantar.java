package polimorfismo;

/**
 *
 * @author andre
 */
public class Jantar {
    
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);
           
        Arroz ingretiente1 = new Arroz(0.2);
        Feijao ingretiente2 = new Feijao(0.1);
        Comida ingretiente3 = new Arroz(0.3);
        
        System.out.println(convidado.getPeso());
        
        convidado.comer(ingretiente1);
        convidado.comer(ingretiente2);
        
        System.out.println(convidado.getPeso());
        
        Sorvete sobremesa = new Sorvete(0.4);
        
        convidado.comer(sobremesa);
        
        System.out.println(convidado.getPeso());
        
        
    }
    
}
