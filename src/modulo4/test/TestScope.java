
package modulo4.test;

import modulo4.ejercicio.MyDate;
import modulo4.ejemplos.ScopeExample;

/**
 *
 * @author Roberto Olveras
 */
public class TestScope {
    public static void main(String[] args) {
        MyDate d = new MyDate();
        int x = 0;
        ScopeExample scope = new ScopeExample();
        scope.metodo1();
        System.out.println("scope.i "+scope.i);
        System.out.println("scope.j "+scope.j);
 
    }
}
