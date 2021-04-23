/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class ControllerIMP implements Controler{

    @Override
    public <T> void writeToFile(ArrayList<T> list, String fileName) {
     
        try (FileOutputStream out = new FileOutputStream(fileName);
                ObjectOutputStream objectOut = new ObjectOutputStream(out);){
            
            objectOut.writeObject(list);
      
            
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public <T> ArrayList<T> readDataFromFile(String fileName) {
     
        ArrayList<T> list_tmp = new ArrayList<>();
        
        try(FileInputStream in = new FileInputStream(fileName);
            ObjectInputStream ojectIn = new ObjectInputStream(in)) {
            
            Object obj = ojectIn.readObject();
            if (obj == null) {
                return  null;
            }
            list_tmp = (ArrayList<T>)obj;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return  list_tmp;
    }
    
}
