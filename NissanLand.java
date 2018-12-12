/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author lewic
 */
public class NissanLand {
        public static void main(String[] args) {

        Nissan nissanS14 = new Nissan(); // creates obj of class Nissan
        nissanS14.passengers = 5;
        nissanS14.horsePower = 217;
        nissanS14.fuelCapacity = 16;
        nissanS14.milesPerGallon = 22;
        nissanS14.maxSpeed = 119;
        nissanS14.engine = "SR20DET";
          
        
        
        System.out.println("Its the year 1993 the new Nissan S14 s240sx has just released");
        System.out.println("*************************************************************");
        System.out.println("Today we will be showcasing the new 1993 Nissan S14");
        System.out.println("Equipped with the: " + nissanS14.engine + "engine pushing 7lbs of boost and easily modifiable!");
        System.out.println("Making a whopping: " + nissanS14.horsePower + " horsepower!");
        System.out.println("And an efficient: " + nissanS14.milesPerGallon + " miles per gallon!");
        System.out.println("With a: " + nissanS14.fuelCapacity + " gallon fuel tank!");
        System.out.println("And comfortable: " + nissanS14.passengers + " passenger seating.");
        System.out.println ("And to top it all off it hits a max speed of: " + nissanS14.maxSpeed + " miles per hour!");
        
        
        
        ArrayAverage Array = new ArrayAverage();
             
               
        
        
        
        
    }

}
 class ZeroToSixty {
    public static void main(String[] args) {
     //Setting up Zero to sixty response
     final String CORRECT_TIME = "6.5";
     //Storage variables
     String enteredTime;
     
     //creating scanner object
     Scanner userInputScanner = new Scanner(System.in);
     //Promt User for Zero To Sixty time
     System.out.println("Enter your best guess for the 0 - 60 time!");
     //read time typed into keyboard into variable
     enteredTime = userInputScanner.next();
     //check if time entered equals correct time 
     if(enteredTime.equals(CORRECT_TIME)){
         //successful authentication message
         System.out.println("What a guess! You're correct!");
     }else{
         //failed authentication message
         System.out.println("Oh your close but not close enough!");
         
         

     }
        
    }        
}
   
    
    
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
