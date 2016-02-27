package modulo3.test;
import modulo4.ejercicio.MyDate;
/**
 *
 * @author Roberto Olveras
 * 
 */
public class TestMyDate {
    
    public static void main(String[] args) {
        MyDate hoy
                = new MyDate(20, 2, 2016); // aqui se construye un 
        MyDate siguenteClase = addDays(7,hoy);
        //System.out.println("Hoy es: ");
        hoy.mostrar();
       // System.out.println("Siguente Clase es: ");
        siguenteClase.mostrar();
        MyDate mañana = new MyDate(20, 2, 2016);
        System.out.println("antes de agregar un dia");
        mañana.mostrar();
        
        mañana.addDays(1);
        hoy.addDays(4);
        System.out.println("despues de agregar un dia a mañana ");
        mañana.mostrar();
         System.out.println("despues de agregar cuatro dias a hoy ");
        hoy.mostrar();
        
    }
    /**
     * Agrega moreDays a baseDate
     * @param moreDays El número de dias a sumar
     * @param baseDate El MyDate base al cual se le agregaran los dias
     * @return MyDate con la nueva fecha
     */
    public static MyDate addDays(int moreDays, MyDate baseDate){
//        baseDate.setDay(moreDays+baseDate.getDay());
//        return baseDate;
        MyDate result = new MyDate();
        result.setDay(moreDays+baseDate.getDay());
        result.setMonth(baseDate.getMonth());
        result.setYear(baseDate.getYear());
        return result;
    }
            
}
