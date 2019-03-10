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
public class Skateboard extends Vehicle {

    private String myBoardLength;

    public Skateboard() {
    }

    public Skateboard(String myBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myBoardLength = myBoardLength;
    }

    public String getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(String myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

    @Override
    public void imprimeDesdeInterface() {
        System.out.println("Se imprime el metodo de la interface desde la clase Skateboard.");
    }

    @Override
    public void imprimrDesdeVehiculo() {
        System.out.println("Se imprime el metodo de la clase Vehicle desde la clase Skateboard.");
    }
}
