package lesson6.task4;


public class ChildOfMan extends Man {
    public ChildOfMan(){}
    public ChildOfMan(String n) {
        super(n);
    }

    @Override
    public String getName() {
        return "Дочерний класс: "+this.name;
    }

    @Override
    public void setName() {
        System.out.print("\nВведите имя(дочерний класс): ");
        this.name = scan.next();
    }

    public static void main(String[] args) {
        ChildOfMan man1 = new ChildOfMan();
        man1.setAge();
        man1.setName();
        System.out.println(man1.getName()+" возраст "+ man1.getAge());
    }
}
