
package abstraccion;

public class profe extends Persona{
    
    private String materia;

    public profe(String materia, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
