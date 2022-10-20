package be.intecbrussel.voorbeeld01;

public class Car extends Vehicle {

    //Vehicle is super Class
    //Car is SubClass

    // properties
    private String brandName = "Audi";


    //getters and setters
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


        // Vehicle class methode
     public void honk() {
         System.out.println("Tuut tuut!");
     }
     public void sound() {
       // Roept de honk() method van Vehicle
         super.honk();



     }
}


