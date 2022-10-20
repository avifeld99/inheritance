package be.intecbrussel.voorbeeld01;

public class MainApp {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("type of vehicle: " + car.getTypeOfVehicle() +
                " brandname: " + car.getBrandName());

        car.honk();
        car.sound();


        Vehicle vehicle = new Vehicle();

        vehicle.honk();

        Bike bike = new Bike();
        bike.honk();




    }
}
