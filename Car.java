/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2;

/**
 *
 * @author swade
 */
public class Car {

    //public member variables: we don't need to implement logic
    //to change these values
    public int year;
    public String makeModel;

    //private member variables because we want to control
    //their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;
    private int gear;

    /**
     * simulates starting this car instance's engine
     */
    public void startEngine() {
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }

    /**
     * simulates stopping this car instance's engine
     */
    public void stopEngine() {
        isEngineRunning = false;
        speed = 0;
        gear = 0;
        System.out.println("...grblllll....shldunk");
    }

    /**
     * Allows access to our private engine status boolean member variable called
     * isEngineRunning
     *
     * @return the status of the engine: true means on, false means off
     */
    public boolean checkEngineStatus() {
        return isEngineRunning;
    }

    /**
     * Allows access to our private speed variable
     * @return the car object's current speed
     */
    public double getCurrentSpeed() {
        return speed;
    }
    
     /**
     * Allows access to our private gear variable
     * @return the car object's current gear
     */
    public int getCurrentGear() {
        return gear;
    }

    /**
     * Controls the car's increases in speed
     *
     * @param mphIncrease
     * @return the current speed of the car after the acceleration has been
     * taken into account
     */
    public double accelerate(int mphIncrease) {
        double os = speed;
        speed = speed + mphIncrease;
        if(speed<5){
            gear = 1;
        }else if(speed<15){
            gear = 2;
        }else if(speed<30){
            gear = 3;
        }else if(speed<40){
            gear = 4;
        }else{
            gear = 5;
        }
        return speed;
    }//close accelerate

    /**
     * Controls the car's decreases in speed
     *
     * @param mphDecrease
     * @return the current speed of the car after the deceleration
     */
    public double decelerate(int mphDecrease) {
        if (mphDecrease < speed) {
            speed = speed - mphDecrease;
            if(speed > 39){
            gear = 5;
        }else if(speed > 29){
            gear = 4;
        }else if(speed > 14){
            gear = 3;
        }else if(speed > 4){
            gear = 2;
        }else{
            gear = 1;
        }
            return speed;
        } else {
            System.out.println("Your car is not going fast enough to decelerate that much.");
            return speed;
        }
    }//close decelerate
    
    private void upShift(double oldSpeed, double mphIncrease){
        System.out.println("Something");
    }

}//close Car
