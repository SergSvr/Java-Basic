package lesson6.task4;

import java.util.Scanner;

public class Man {
    protected Scanner scan = new Scanner(System.in);
    int age;
    String name;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge() {
        System.out.println("Введите возраст: ");
        this.age = scan.nextInt();
    }

    public int getAge() {
        return this.age;
    }

    public void setName() {
        System.out.print("\nВведите имя: ");
        this.name = scan.next();
    }

    public String getName() {
        return this.name;
    }

    public String getInfo(){
        return "Возраст: "+this.age;
    }
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setAge();
        man1.setName();
        System.out.println(man1.getInfo());
    }
}
