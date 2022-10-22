package be.intecbrussel.animal;

public class MainApp {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Lion lion = new Lion();

        Tiger tiger = new Tiger("Tiger");

        Jaguar jaguar = new Jaguar("jaguar");

        tiger.TigerRoaring();
        tiger.animalRoaring();
        tiger.noise();
        System.out.println(animal.getTypeOfAnimal());
        System.out.println(tiger.getTypeOfAnimal());

    }
}
