

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonaTest
{
    /**
     * Default constructor for test class PersonaTest
     */
    
    Agenda agenda;
    
    public PersonaTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Persona p1 = new Persona("Carlos", "Angarita");
        Persona p2 = new Persona("Claudia", "Gomez");
        Persona p3 = new Persona("Belen", "Llanez");
        agenda = new Agenda();
        agenda.agregar(p1);
        agenda.agregar(p2);
        agenda.agregar(p3);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void cantidadDePersonas()
    {
        assertEquals(3, agenda.getPersonas().size());
    }
    
    @Test
    public void primeraPersona()
    {
        assertEquals("Carlos", agenda.getPersonas().get(0).getNombre());
    }
}


