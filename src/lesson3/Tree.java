package lesson3;

public class Tree {
    int age;
    boolean alive;
    String name;

    Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Tree(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public static void main(String[] args) {
        Tree tr1 = new Tree(22, "Дерево1");
        Tree tr2 = new Tree(25, "Дерево2", true);
        Tree tr3 = new Tree();
    }
}
