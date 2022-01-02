/*
* The "Bike" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Bike extends Vehicle {

    // variables
    /**
    * Multiplier for the speed.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Calling methods from its superclass (Vehicle).
    */
    public Bike() {
        super();
    }

    // The Bike class has one unique field

    private int cadence = 0;

    // getters
    /**
    * The getter for cadence.
    */
    public void getCadence() {
        System.out.print("Your current cadence is " + cadence + " rpm.");
    }

    // methods
    /**
    * The newCadence() method changes the rpm of the bike.
    */
    public int newCadence(final int inputtedCadence) {
        cadence = inputtedCadence;
        System.out.println("\nYou cadence was set to " + cadence + " rpm.");
    }

}