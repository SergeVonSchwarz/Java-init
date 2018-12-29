package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Jhon");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();

        /* -------------------- */

        ShowInfo info1 = new Animal(2);
        ShowInfo info2 = new Person("Neo");

        System.out.println("-----------");

        /* Доступ только к методам интерфейса */
        info1.showInfo();
        info2.showInfo();

        System.out.println("-----------");

        outputInfo(info1);
        outputInfo(info2);

        System.out.println("-----------");

        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(ShowInfo info){
        info.showInfo();
    }
}
