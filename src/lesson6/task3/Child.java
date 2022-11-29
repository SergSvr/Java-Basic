package lesson6.task3;

public class Child extends Mother {
    public Child() {
    }

    public int getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Child ch1=new Child();
        System.out.println(ch1.getNumber());
    }
}
