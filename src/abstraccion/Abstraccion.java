
package abstraccion;

public class Abstraccion {

    public static void main(String[] args) {
     Alumno per = new Alumno(178, "ro", 27);
     profe pr = new profe("programaion", "matias", 25);
     
        System.out.println("Nombre alumno" + per.getNombre()+ " Edad alumono"+ per.getEdad());
        System.out.println("");
    }
    
}
