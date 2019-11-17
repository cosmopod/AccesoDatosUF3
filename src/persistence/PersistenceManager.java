/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paco
 */
public class PersistenceManager {

    public static void SaveToBinaryFile(Serializable serializableObject, String filePath) {

        //Creamos el objeto file con la ruta que le pasamos por parametro
        File objectFile = new File(filePath);
        try {

            //creamos flujo de escritura de objeto en el archivo
            FileOutputStream fileStream = new FileOutputStream(objectFile, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);
            objectOutputStream.writeObject(serializableObject);

            //cerramos el flujo de escritura de archivo
            objectOutputStream.close();
            fileStream.close();

        } catch (FileNotFoundException ex) { //Control de excepciones
            Logger.getLogger(PersistenceManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersistenceManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
