package lesson3;

import java.time.LocalDate;

class Home {
    int floors;
    int year;
    String name;

    void setValues(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    void printValues() {
        System.out.println("Name:" + this.name + " Floors:" + this.floors + " Year:" + this.year);
    }

    int howOld() {
        return LocalDate.now().getYear() - this.year;
    }

    public static void main(String[] args) {
        Home home1=new Home();
        Home home2=new Home();
        home1.setValues(5,1946,"Дом1");
        home2.setValues(7,1992,"Новый Дом");
        home2.setValues(7,1992,"Новый Дом 2");
        home1.printValues();
        System.out.println("Возраст дома "+home1.howOld());
        home2.printValues();
        System.out.println("Возраст дома "+home2.howOld());
    }
}
