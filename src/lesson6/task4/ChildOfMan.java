package lesson6.task4;


public class ChildOfMan extends Man {
    public ChildOfMan() {
    }

    public String getInfo() {
        return "Имя пользователя: " + this.name;
    }

    public static void main(String[] args) {
        ChildOfMan man1 = new ChildOfMan();
        man1.setAge();
        man1.setName();
        System.out.println(man1.getInfo());
    }
}
