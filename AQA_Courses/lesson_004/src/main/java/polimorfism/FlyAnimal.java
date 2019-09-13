package polimorfism;

public class FlyAnimal extends Animal {

    @Override
    public void sound() {
        super.sound();
        System.out.println("And fly ");
    }
}
