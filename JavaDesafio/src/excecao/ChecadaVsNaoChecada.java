package excecao;

/**
 *
 * @author andre
 */
public class ChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        
        geraErro1();
        
        try {
            geraErro2();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Fim :)");
    }
    
    static void geraErro1() throws RuntimeException {
        throw new RuntimeException("Ocorreu um erro 01");
    }
        
    static void geraErro2() throws Exception{
          throw new Exception("Ocorreu um erro #02");
    }
    
}
