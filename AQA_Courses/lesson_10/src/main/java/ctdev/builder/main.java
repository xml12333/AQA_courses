package ctdev.builder;

public class main {

    Person myPerson = new Person.Builder()
            .withName("Jane")
            .withSurname("Doe")
            .withAge(32)
            .withHeight(165)
            .withWeight(70)
            .build();
}

