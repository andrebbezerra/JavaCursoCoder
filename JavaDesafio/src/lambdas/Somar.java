package lambdas;

/**
 *
 * @author andre
 */
public class Somar implements Calculo{

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
    
}
