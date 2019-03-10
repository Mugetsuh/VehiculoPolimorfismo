/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculopoli;

/**
 *
 * @author shhin
 */
public class Blcycle extends Vehicle{
    
    private String myGearCount;

    public Blcycle(String myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }

    public String getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(String myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
