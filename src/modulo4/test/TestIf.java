
package modulo4.test;

import modulo4.ejercicio.MyDate;

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
        MyDate d = new MyDate(27,2,2017);
        d.getNameMonth();
    }
}
