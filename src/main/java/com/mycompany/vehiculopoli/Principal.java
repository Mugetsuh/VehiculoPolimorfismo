/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculopoli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Principal {

    List<Vehicle> vehicles = new ArrayList<>();

    public void menuPrincipal() {
        crearVehiculos();
        Car car = new Car();
        Jet jet = new Jet();
        Skateboard skateboard = new Skateboard();
        Bicycle bicycle = new Bicycle();

        car.imprimeDesdeInterface();
        car.imprimeDesdePowered();
        car.imprimrDesdeVehiculo();
        jet.imprimeDesdeInterface();
        jet.imprimeDesdePowered();
        jet.imprimrDesdeVehiculo();
        skateboard.imprimeDesdeInterface();
        skateboard.imprimrDesdeVehiculo();
        bicycle.imprimeDesdeInterface();
        bicycle.imprimrDesdeVehiculo();
        imprimirVehiculos();
    }

    private void crearVehiculos() {
        Car car1 = new Car("3", "Premium", "Honda   ", "Civic");
        vehicles.add(car1);
        Car car2 = new Car("4", "Current", "Mazda   ", "323");
        vehicles.add(car2);
        Jet jet1 = new Jet("4", "A.C.P.M", "Avianca", "2005");
        vehicles.add(jet1);
        Jet jet2 = new Jet("5", "Gas", "NASA   ", "2018");
        vehicles.add(jet2);
        Skateboard skateboard1 = new Skateboard("60", "SK8   ", "aw123");
        vehicles.add(skateboard1);
        Skateboard skateboard2 = new Skateboard("65", "Skate X", "X3500");
        vehicles.add(skateboard2);
        Bicycle bicycle1 = new Bicycle("2", "Shimano", "2011");
        vehicles.add(bicycle1);
        Bicycle bicycle2 = new Bicycle("3", "Wheels", "WX400");
        vehicles.add(bicycle2);
    }

    private void imprimirVehiculos() {
        System.out.println();
        System.out.println("Lista de todos los Vehiculos: ");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                System.out.println("Car:");
                System.out.printf("My Engine Size: " + ((Car) vehicle).getMyEngineSize() + "\tMy Fuel Type: " + ((PoweredVehicle) vehicle).getMyFuelType()
                        + "\tMy Brand: " + vehicle.getMyBrand() + "\tMy Model: " + vehicle.getMyModel());
                System.out.println();
            }

            if (vehicle instanceof Jet) {
                System.out.println("Jet:");
                System.out.printf("My Engine Count: " + ((Jet) vehicle).getMyEngineCount() + "\tMy Fuel Type: " + ((Jet) vehicle).getMyFuelType()
                        + "\tMy Brand: " + vehicle.getMyBrand() + "\tMy Model: " + vehicle.getMyModel());
                System.out.println();
            }

            if (vehicle instanceof Skateboard) {
                System.out.println("Skateboard:");
                System.out.printf("My Board Length: " + ((Skateboard) vehicle).getMyBoardLength() + "\tMy Brand: " + vehicle.getMyBrand()
                        + "\tMy Model: " + vehicle.getMyModel());
                System.out.println();
            }

            if (vehicle instanceof Bicycle) {
                System.out.println("Bicycle:");
                System.out.printf("My Gear Count: " + ((Bicycle) vehicle).getMyGearCount() + "\tMy Brand: " + vehicle.getMyBrand()
                        + "\tMy Model: " + vehicle.getMyModel());
                System.out.println();
            }
        }
    }
}
