/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Keyboard.Controller;

import ec.edu.espe.Keyboard.Model.Keyboard;
import utils.FileManager;

/**
 *
 * @author SAAVEDRA
 */
public class KeyboardController {
    public void save (Keyboard Keyboard){
        String data= Keyboard.getMark()+ ";" + Keyboard.getColor() + ";" + Keyboard.getyearsUse()+ ";" + Keyboard.getsize() + ";" + Keyboard.isIsWireless();
        FileManager.save(data , "Keyboard");
    }
    public String read (){
        String data;
        data= FileManager.read("Keyboard");
        return data;
    }
}
