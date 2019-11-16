package entidades;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author paco
 */
public class Alumno implements Serializable{
    
    public int id;
    public String nombre;
    public String nacionalidad;
    public int edad;
    public String sexo;
    public List<Modulo> modulos;
}
