package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author andre
 */
public class Reduce1 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;
        
        Integer total1 = nums.stream().reduce(soma).get();
        
        System.out.println(total1);
        
        //STREAM REDUCE PASSANDO O VALOR INICIAL DE 100
        Integer total2 = nums.stream().reduce(100,soma);
        
        System.out.println(total2);
        
        // RESULTADO FOI UM OPCIONAL<INTEGER>...
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
    }
    
}
