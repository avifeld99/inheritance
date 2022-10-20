package be.intecbrussel.animal;

public class Lion extends Animal {

    public Lion() {
        System.out.println("lion no args :(");
    }

    public Lion(String typeOfAnimal) {
        super(typeOfAnimal);
        System.out.println("Lion the king!");
    }
}
