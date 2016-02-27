
package modulo4.test;

import java.util.Date;

/**
 *
 * @author Roberto Olveras
 */
public class TestAsignacion {
    public static void main(String[] args) {
        int horaDelDia 
                = new Date().getHours();
        String saludo = 
                (horaDelDia >=12) ? 
                   "Buenas Tardes" : 
                            "Buenos dias";
        System.out.println(saludo);
    }
}
