/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Keyboard.Model;

/**
 *
 * @author SAAVEDRA
 */
public class Keyboard {
    
    private String color;
    private String mark;
    private String size;
    private int yearsUse;
    private boolean isWireless;
    
    
    public Keyboard(String mark, String color, int yearsUse, boolean wireless, String size) {
        
        this.color = color;
        this.mark = mark;
        this.size = size;
        this.yearsUse = yearsUse;
        this.isWireless = isWireless;
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
    public String getsize() {
        return size;
    }

    /**
     * @param model the model to set
     */
    public void setsize(String model) {
        this.size = size;
    }

    /**
     * @return the yearCreation
     */
    public int getyearsUse() {
        return yearsUse;
    }

    /**
     * @param yearsUse the yearCreation to set
     */
    public void setyearsUse(int yearCreation) {
        this.yearsUse = yearsUse;
    }

    /**
     * @return the isTactile
     */
    public boolean isIsWireless() {
        return isWireless;
    }
    }
    

