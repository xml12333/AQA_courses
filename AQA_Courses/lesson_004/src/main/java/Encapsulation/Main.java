package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Encaps encap = new Encaps();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}
