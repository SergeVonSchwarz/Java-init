package Interfaces;

public class Animal implements ShowInfo {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void showInfo() {
        System.out.println("ID: " + id);
    }
}
