/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convesorImagen;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Gael
 */
public class ToBytes {
    
    public byte[] getBytes(File file) throws FileNotFoundException, IOException{
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream boutputStream = new ByteArrayOutputStream();
        FileInputStream  finputStream = new FileInputStream(file);
        int read;
        
        while((read = finputStream.read(buffer)) != -1){
            boutputStream.write(buffer,0,read);
        }
        finputStream.close();
        boutputStream.close();
        return boutputStream.toByteArray();
    }
}
