package padroes.observer;

import java.util.Date;

/**
 *
 * @author andre
 */
public class EventoChegadaAniversariante {
    private final Date momento;

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
    
    
}
