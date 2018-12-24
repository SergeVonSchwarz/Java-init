public class ClassesAndObjects2 {
    public static void main(String[] args) {

        Person2 person1 = new Person2();
        person1.name = "Jhon";
        person1.age = 35;
        person1.showInfo();
        person1.sayHello();
        System.out.printf("\n%s\n", person1.sayHelloMore());
        System.out.printf("\n%s\n", person1.sayHelloMoreInfo("Java"));

        Person2 person2 = new Person2();
        person2.name = "Jim";
        person2.age = 33;
        person2.showInfo();

    }
}

class Person2 {
    String name;
    int age;

    void showInfo() {
        System.out.printf("\nName: %s\nAge: %d\n", name, age);
    }

    void sayHello() {
        System.out.printf("\nHello %s\n", name);
    }

    String sayHelloMore() {
        return "Fuck you " + name;
    }

    String sayHelloMoreInfo(String str) {
        return "You said " + str + " " + name;
    }
}