package heranca;

/**
 *
 * @author andre
 */
public class Ferrari extends Carro implements Esportivo{
    
    @Override
    void acelerar(){
        velocidadeAtual += 15;
    }

    @Override
    public void ligarTurbo() {
    }

    @Override
    public void desligarTurbo() {
    }
}
