package lesson6.task3;

public class Child extends Mother {
    public Child() {
    }

    public int getNumber() {
        return Mother.number;
    }

    public void setNumber(int num){
        Mother.number=num;
    }
    public static void main(String[] args) {
        Child ch1=new Child();
        System.out.println(ch1.getNumber());
        ch1.setNumber(100);
        System.out.println(ch1.getNumber());
        Child ch2=new Child();
        System.out.println(ch2.getNumber());
    }
}
