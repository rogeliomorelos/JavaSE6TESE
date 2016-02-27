
package modulo4.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestBits {
    public static void main(String[] args) {
        int x = 10;
        int y = x >> 2;
        System.out.println("y: "+y);
        
        int a = x | y;
        int b = ~a;
        System.out.println("a:  "+a);
        System.out.println("b: "+b);
    }
}
