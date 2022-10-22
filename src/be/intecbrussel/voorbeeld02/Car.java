package be.intecbrussel.voorbeeld02;

public class Car extends Vehicle {

    /*
  *Dit zal niet worden uitgevoerd. Als we de this() uit comment halen en de
 ander in comment zetten in de
  * Vehicle class kun je het veerschil zien. Vergeet niet dat er altijd 1
 constructor zonder een this() moet zijn.
  */
    public Car() {
        System.out.println("No args constructor Car");
    }
    // This will be executed third
    public Car(String typeOfVehicle) {
        // this("car"); -> not possible, because 'this' and 'super' must be first statement
        super(typeOfVehicle);
        System.out.println("Car constructor");
    }
}
