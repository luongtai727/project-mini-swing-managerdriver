/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macbook
 */
public interface view {
    
    <T> void showData(ArrayList<T> listData, DefaultTableModel defaultTableModel);
    
}
