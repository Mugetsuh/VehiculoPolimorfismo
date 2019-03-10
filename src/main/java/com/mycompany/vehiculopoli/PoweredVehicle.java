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
public abstract class PoweredVehicle extends Vehicle {

    private String myFuelType;

    public PoweredVehicle() {
    }

    public PoweredVehicle(String myFuelType, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myFuelType = myFuelType;
    }

    public String getMyFuelType() {
        return myFuelType;
    }

    public void setMyFuelType(String myFuelType) {
        this.myFuelType = myFuelType;
    }

    public void imprimeDesdePowered() {
        System.out.println("Se imprime desde la clase PoweredVehicle.");
    }
}
