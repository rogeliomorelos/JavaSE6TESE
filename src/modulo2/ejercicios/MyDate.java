/**
 *
 * @author Roberto Olvera
 */

package modulo2.ejercicios;

public class MyDate {
    /**
     * Representa un dia
     */
    private int day;
    /**
     * Representa un mes
     */
    private int month;
    /**
     * Representa un año
     */
    private int year;
    
    public MyDate(){
        
    }
    /**
     * Construye un objeto con valores iniciales para
     * el dia , mes y año
     * @param day Representa el dia
     * @param month Representa el mes
     * @param year Representa el año
     */
    public MyDate(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * Muestra la fecha en consola
     */
    public void mostrar(){
        System.out.println(day+"/"+month+"/"+year);
    }

    public int getDay() {
        return day; // regresar el valor de la variable day
    }

    public void setDay(int day) {
        // escribir funcionalidad para validar dia correcto
              
        /*
        * si el valor de d esta entre 1 y 31 colocar el valor
        * si no esta en el rango colocar por default 1
        */
        if(day<=31 && day>=1){
             this.day = day ; // colocar el valor del argumento d en day
        }else{
            this.day=1;
        }   
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        month = m;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }
    
    
}


