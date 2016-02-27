package modulo2.test;
import modulo2.ejercicios.MyDate;
/**
 *
 * @author Roberto Olveras
 */
public class TestMyDate {
    
    public static void main(String[] args) {
        MyDate hoy
                = new MyDate(6, 2, 2016); // aqui se construye un 
                                           //objeto de la clase MyDate
        MyDate otroDia
                = new MyDate(); // aqui se construye un 
        //objeto de la clase MyDate
        int x = 8;
        int y = 3;
        int z = x;
        //valores primitivos
        System.out.println("x: "+x);
        System.out.println("z: "+z);
        System.out.println("cambio valor z = 20");
        z=20;
        System.out.println("x: "+x);
        System.out.println("z: "+z);
        // valores de referencia
//        MyDate mañana = hoy;
//        System.out.println("hoy.getDay():"+hoy.getDay());
//        System.out.println("cambiando valor mañana.setDay(20)");
//        mañana.setDay(20);
//        System.out.println("hoy.getDay():"+hoy.getDay());
//         System.out.println("mañana.getDay():"+mañana.getDay());
        //System.out.println(otroDia.getDay());
        //System.out.println(hoy.getDay());
//        hoy.setDay(45);
//        hoy.setMonth(2);
//        hoy.setYear(2016);

        {
           // hoy.mostrar();
            //otroDia.mostrar();
        }
       
                                
    }
}
