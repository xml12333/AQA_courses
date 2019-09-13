package polimorfism;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal horse = new Horse();
        Animal flyAnimal = new FlyAnimal();
        animal.sound();
        cat.sound();
        horse.sound();
        flyAnimal.sound();
    }
}
