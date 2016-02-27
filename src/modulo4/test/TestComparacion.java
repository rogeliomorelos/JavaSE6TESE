
package modulo4.test;

import java.util.Date;
import modulo3.ejercicios.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestComparacion {
    public static void main(String[] args) {
        System.out.println(7>7); // false
        System.out.println(7>=7); // true
        System.out.println((3+3)<7); // true
        System.out.println((3+4)<=7); // true
        System.out.println(7==7); // true
        System.out.println(7!=7); // flase
        System.out.println("----");
        System.out.println("Hola"=="Hola"); 
        System.out.println("Hola".equals("Hola"));
        System.out.println(new MyDate() == new MyDate()); // false
        System.out.println("....Literales...");
        System.out.println(null != null);
        System.out.println(true == false);
        System.out.println(false == false);
    }
}
