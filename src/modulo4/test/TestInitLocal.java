
package modulo4.test;

import modulo3.ejercicios.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestInitLocal {
    public static void main(String[] args) {
        /*
        * en variables locales no hay inicializacion 
        * por defecto
        */
        int x = 9;
        int y ;
        int z;
        if(x>50){
            y = 7;
        }
        //z = y + x;
        
        // las variables de clase se inicializan por defecto
        MyDate algo = new MyDate();
        algo.mostrar();
        
    }
}
