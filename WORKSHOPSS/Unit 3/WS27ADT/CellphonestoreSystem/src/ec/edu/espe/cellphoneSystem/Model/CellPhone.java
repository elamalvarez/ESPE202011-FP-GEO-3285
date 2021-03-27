/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphoneSystem.Model;

/**
 *
 * @author SAAVEDRA
 */
public class CellPhone {
    private String color;
    private String mark;
    private String model;
    private int yearCreation;
    private boolean isTactile;

    public CellPhone(String color, String mark, String model, int yearCreation, boolean isTactile) {
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.yearCreation = yearCreation;
        this.isTactile = isTactile;
    }
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the yearCreation
     */
    public int getYearCreation() {
        return yearCreation;
    }

    /**
     * @param yearCreation the yearCreation to set
     */
    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    /**
     * @return the isTactile
     */
    public boolean isIsTactile() {
        return isTactile;
    }

    /**
     * @param isTactile the isTactile to set
     */
    public void setIsTactile(boolean isTactile) {
        this.isTactile = isTactile;
    }
    
    
    
}
