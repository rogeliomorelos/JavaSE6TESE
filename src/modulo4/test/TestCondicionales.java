
package modulo4.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestCondicionales {
    public static void main(String[] args) {
        
        System.out.println((5>8)& true); // false
        System.out.println((5>8)&& true); // false
        
        System.out.println(null == null | (6>(1+5))); // true
        System.out.println(null == null || (6>(1+5))); // true
      
        // 
        System.out.println(false ^ (true | false)); // true
        System.out.println(!(7>7) & true); // true
    }
}
