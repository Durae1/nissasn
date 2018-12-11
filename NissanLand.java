/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author lewic
 */
public class NissanLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nissan nissanS14 = new Nissan(); // creates obj of class Nissan
        nissanS14.passengers = 5;
        nissanS14.horsePower = 217;
        nissanS14.fuelCapacity = 16;
        nissanS14.milesPerGallon = 22;
        nissanS14.maxSpeed = 119;
        nissanS14.engine = "SR20DET";

        System.out.println("Nissan S14 passengers: " + nissanS14.passengers);

    }

}
