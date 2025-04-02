import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files{
    
    public int[] fileToIntArray(String filename){
        File file; //Apuntar a un archivofísico del disco duro
        FileReader reader; //LLave con permiso de sólo lectura
        BufferedReader bufer; //Para recuperar información del archivo
        String linea; //Una línea del archivo
        int[] array = null; //arreglo de números resultantes
        int i=0; //indice
        int t; //tamaño
        try{
            t = countFileLines(fileName);
            array = new int[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);        
        } catch ( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }
 }