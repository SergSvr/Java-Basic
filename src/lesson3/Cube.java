package lesson3;

public class Cube {
    int mass;
    String color;
    String label;

    public Cube(String color) {
        this.color = color;
    }

    public Cube(String color, int mass) {
        this.color = color;
        this.mass = mass;
    }

    public Cube() {
    }

    public void printData() {
        System.out.println("Color:" + this.color + " Label:" + this.label + " Mass:" + this.mass);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube("Белый", 11);
        Cube cube2 = new Cube();
        cube2.setColor("Черный");
        cube2.setMass(22);
        cube2.setLabel("Кубик2");
        cube1.setLabel("Кубик1");
        cube2.printData();
        cube1.printData();
    }
}
