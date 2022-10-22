package be.intecbrussel.animal;

public class Animal {

    private String typeOfAnimal;

    public Animal() {
        this("cat family");
    }

    public Animal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
        System.out.println("name of animal = ");
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void animalRoaring() {
        System.out.println("GROOOAAA@*/ùµ!");
    }

}
