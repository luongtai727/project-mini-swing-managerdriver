/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class Driver implements Serializable{
    private String idString;
    private String nameString;
    private String AdressString;
    private String levelString;

    public Driver()
    {
    }
    
    public Driver(String idString, String nameString, String AdressString, String levelString) {
        this.idString = idString;
        this.nameString = nameString;
        this.AdressString = AdressString;
        this.levelString = levelString;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getAdressString() {
        return AdressString;
    }

    public void setAdressString(String AdressString) {
        this.AdressString = AdressString;
    }

    public String getLevelString() {
        return levelString;
    }

    public void setLevelString(String levelString) {
        this.levelString = levelString;
    }
    
    
    
}
