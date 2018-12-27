public class SetGet {
    public static void main(String[] args) {
        User person = new User();
        person.setName("");
        person.setAge(0);
        person.showInfo();

        User person1 = new User();
        person1.setName("Sergio");
        person1.setAge(35);
        person1.showInfo();
    }
}

class User {
    private String name;
    private int age;

    public void setName(String name) {
        if(name.isEmpty()) {
            this.name = "Empty";  // this.name property of class User
        } else {
            this.name = name;
        }
    }

    public void setAge(int userAge) {
        if(userAge <= 0) {
            age = 18;
        } else {
            age = userAge;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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