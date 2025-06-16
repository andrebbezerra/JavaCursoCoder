package Streams;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class Aluno {
    
    final String nome;
    final double nota;
    final boolean bomComportamento;
    
    public Aluno(String nome, double nota) {
        this(nome, nota,true);
    }

    public Aluno(String nome, double nota,boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
              
    }
    
    public String toString(){
        return nome + " tem nota " + nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        hash = 97 * hash + (this.bomComportamento ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (this.bomComportamento != other.bomComportamento) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
}
