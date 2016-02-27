
package modulo4.test;

import java.util.Date;

/**
 *
 * @author Roberto Olveras
 */
public class TestIf {
    public static void main(String[] args) {
        int horaActual= 21;
        String saludo = "";
        if(horaActual<12){
            saludo="Buenos Dias";
        }else if(horaActual < 20){
            saludo="Buenos Tardes";
        }else{
            saludo="Buenos Noches";
        }
        System.out.println(saludo);
    }
}
