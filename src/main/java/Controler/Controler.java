/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface Controler {
    
     <T> void writeToFile(ArrayList<T> list, String fileName);
     
     <T> ArrayList<T> readDataFromFile(String fileName);
}
