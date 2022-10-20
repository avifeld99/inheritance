package be.intecbrussel.animal;

public class Tiger extends Animal {

    public Tiger(String typeOfAnimal) {
        super(typeOfAnimal);
        System.out.println("Tiger the biggest cat!");
    }


    public void TigerRoaring() {
        System.out.println("GRRROOAA**Tigerrrr");
    }

    public void noise() {
        super.animalRoaring();
    }
}
