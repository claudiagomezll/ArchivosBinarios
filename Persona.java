
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona implements java.io.Serializable
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido; 

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        
    }
    
    public Persona(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido) { 
        this.apellido = apellido;
    }
    
    public void MostrarDatos(){
    
    }

}
