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
public class Jet extends PoweredVehicle {

    private String myEngineCount;

    public Jet() {
    }

    public Jet(String myEngineCount, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }

    public String getMyEngineCount() {
        return myEngineCount;
    }

    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }

    @Override
    public void imprimeDesdeInterface() {
        System.out.println("Se imprime el metodo de la interface desde la clase Jet");
    }

    @Override
    public void imprimrDesdeVehiculo() {
        System.out.println("Se imprime el metodo de la clase Vehicle desde la clase Jet");
    }
}
