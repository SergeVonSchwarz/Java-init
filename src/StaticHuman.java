public class StaticHuman {
    private String name;
    private int age;

    public static String desc;
    public static int countHuman;

    /* constant */
    public static final int CONSTANT1 = 13;
    public static final int CONSTANT2 = 9;

    public StaticHuman() {
        this.name = "Jhon";
        this.age = 40;
        countHuman++;
    }

    public StaticHuman(String name, int age) {
        this.name = name;
        this.age = age;
        countHuman++;
    }

    public String toString() {
        return name + " - " + age;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void showInfo() {
        System.out.printf("Name: %s\nAge: %d\n", this.name, this.age);
    }
    public static void showStatic() {
        System.out.println("Static description: " + desc);
    }
    public void getAllFields() {
        System.out.printf("\n%s %d %s\n%d people init\n%d %d\n\n", name, age, desc, countHuman, CONSTANT1, CONSTANT2);
    }
}
