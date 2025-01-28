package lambdas;

/**
 *
 * @author andre
 */
public class Multiplicar implements Calculo{

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
    
}
