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
public class Buses implements Serializable{
    private String idBusesString;
    private String rangeString;
    private String pointString;
    
    public Buses()
    {
    }

    public Buses(String idBusesString, String rangeString, String pointString) {
        this.idBusesString = idBusesString;
        this.rangeString = rangeString;
        this.pointString = pointString;
    }

    public String getIdBusesString() {
        return idBusesString;
    }

    public void setIdBusesString(String idBusesString) {
        this.idBusesString = idBusesString;
    }

    public String getRangeString() {
        return rangeString;
    }

    public void setRangeString(String rangeString) {
        this.rangeString = rangeString;
    }

    public String getPointString() {
        return pointString;
    }

    public void setPointString(String pointString) {
        this.pointString = pointString;
    }
    
    
    
    
}
