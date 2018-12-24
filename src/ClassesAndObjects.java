public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Jhon";
        person1.age = 35;
        System.out.printf("\nName: %s\nAge: %d\n", person1.name, person1.age);

        Person person2 = new Person();
        person2.name = "Jim";
        person2.age = 33;
        System.out.printf("\nName: %s\nAge: %d\n", person2.name, person2.age);

    }
}

class Person {
    String name;
    int age;
}