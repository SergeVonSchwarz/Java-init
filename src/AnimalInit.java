public class AnimalInit {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.eat();
        cat.sleep();
        System.out.println("Name: " + cat.name);

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        System.out.println("Name: " + dog.name);
    }
}
