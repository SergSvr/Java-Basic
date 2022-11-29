package lesson6.task4;

import lesson6.task1.Human;

public class HumanChild extends Human {
    public HumanChild(String n, String s) {
        super(n, s);
    }
    @Override
    public String getFullName() {
        return this.name+" "+this.surname;
    }

    @Override
    public void setName(String name) {
        this.name="Child:"+name;
    }

    @Override
    public String getName() {
        return "Child-"+this.name+this.surname;
    }

    public static void main(String[] args) {
        HumanChild ch1=new HumanChild("","");
        System.out.println("Введите имя:");
        ch1.setName(ch1.scan.nextLine());
        System.out.println(ch1);
        System.out.println(ch1.getName());
    }
}
