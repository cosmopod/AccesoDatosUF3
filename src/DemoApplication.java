
import entidades.Alumno;
import entidades.Modulo;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import persistence.PersistenceManager;

/**
 *
 * @author paco
 */
public class DemoApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Profesor
        Profesor profFilosofia = new Profesor();
        profFilosofia.id = 1;
        profFilosofia.nombre = "Irene";
        profFilosofia.sexo = "Mujer";
        
        //Modulo
        Modulo moduloFilosofia = new Modulo();
        moduloFilosofia.id = 1;
        moduloFilosofia.codigo = "34FG7";
        moduloFilosofia.nombre = "Filosofía";
        
        //lista modulos
        List<Modulo> listaModulos = new ArrayList<>();
        listaModulos.add(moduloFilosofia);
        
        //Alumno
        Alumno alumnoFilosofia = new Alumno();
        alumnoFilosofia.id = 1;
        alumnoFilosofia.nombre = "Alberto Rosales";
        alumnoFilosofia.nacionalidad = "Española";
        alumnoFilosofia.sexo = "Varon";
        alumnoFilosofia.modulos = listaModulos;
        
        //Almacenamos en archivos binarios los objetos creados
        PersistenceManager.SaveToBinaryFile(profFilosofia, "‪Profesores/");
        PersistenceManager.SaveToBinaryFile(moduloFilosofia, "‪Modulos/");
        PersistenceManager.SaveToBinaryFile(alumnoFilosofia, "‪Alumnos/");
        

    }

}
