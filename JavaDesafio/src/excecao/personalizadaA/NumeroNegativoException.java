package excecao.personalizadaA;

/**
 *
 * @author andre
 */
public class NumeroNegativoException extends RuntimeException{
    
   private String nomeDoAtributo;
   
   public NumeroNegativoException(String nomeDoAtributo){
       this.nomeDoAtributo = nomeDoAtributo;
   }

   public String getMesage(){
       return String.format("O atributo %s está negativo", nomeDoAtributo);
   }
   
}
