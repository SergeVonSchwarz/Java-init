public class Constructor {
    public static void main(String[] args) {

        /* Constructor and polymorphism */

        Human human1 = new Human();
        human1.showInfo();

        System.out.println();

        Human human2 = new Human("Sergio", 35);
        human2.showInfo();
    }
}

class Human {

    private String name;
    private int age;

    public Human() {
        System.out.println("Constructor 1");
        this.name = "User";
        this.age = 18;
    }

    public Human(String name, int age) {
        System.out.println("Constructor 2");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void showInfo() {
        System.out.printf("Name: %s\nAge: %d\n", this.name, this.age);
    }
}