package abstrato;

/**
 *
 * @author andre
 */
public abstract class Mamifero extends Animal{

    public abstract String mamar();

    @Override
    public final String mover() {
        return "Saindo do lugar";
    }
    
    
    
}
