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
public class Car extends PoweredVehicle {

    private String myEngineSize;

    public Car() {
    }

    public Car(String myEngineSize, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }

    public String getMyEngineSize() {
        return myEngineSize;
    }

    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }

    @Override
    public void imprimeDesdeInterface() {
        System.out.println("Se imprime el metodo de la interface desde la clase Car");
    }

    @Override
    public void imprimeDesdePowered() {
        System.out.println("Se imprime PoweredVehicle desde la clase Car.");
    }
}
