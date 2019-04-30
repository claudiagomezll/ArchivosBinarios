import java.io.*;
import java.util.*;

public class Agenda implements Serializable
{
    List<Persona> personas;
    
    public Agenda() { 
        personas = new ArrayList<Persona>();
    }
    
    public List<Persona> getPersonas() { 
        
        return this.personas;
    }
    
    public void agregar(Persona p) {
        this.personas.add(p);
    }
    
    public void salvaAFichero(String nomFich)
    throws IOException {
    
        ObjectOutputStream sal = null;
    
        try {
    
    // Abre los streams iniciador y filtro
    
            sal = new ObjectOutputStream(
    
            new FileOutputStream(nomFich));
    
    // graba el objeto actual
    
            sal.writeObject(this);
    
        } finally {
    
            if (sal != null) {
    
                sal.close(); // cierra los streams
    
            }
    
        }
    
    }
    
    
    
    public void leeDeFichero(String nomFich)
    throws IOException, ClassNotFoundException {
    
        ObjectInputStream ent = null;
        try {

            ent = new ObjectInputStream(
            
            new FileInputStream(nomFich));
            
            // lee el objeto y le retorna
            
            //return (Agenda)ent.readObject();
            this.personas = ((Agenda)ent.readObject()).getPersonas();
        
        } finally {
        
            if (ent != null) {
            
            ent.close(); // cierra los streams
            
            }
        
        }
    
    }

    
    
}
