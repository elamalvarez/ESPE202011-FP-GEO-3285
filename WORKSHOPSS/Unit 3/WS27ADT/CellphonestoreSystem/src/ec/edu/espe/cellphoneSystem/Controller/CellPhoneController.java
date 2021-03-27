/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphoneSystem.Controller;

import ec.edu.espe.cellphoneSystem.Model.CellPhone;
import utils.FileManager;

/**
 *
 * @author SAAVEDRA
 */
public class CellPhoneController {
    public void save (CellPhone CellPhone){
        String data= CellPhone.getMark()+ " , " + CellPhone.getModel() + " , " + CellPhone.getYearCreation()+ " , " + CellPhone.getColor() + " , " + CellPhone.isIsTactile();
        FileManager.save(data , "CellPhones");
    }
}
