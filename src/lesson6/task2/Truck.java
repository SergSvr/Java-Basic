package lesson6.task2;

public class Truck extends Car {
    int wheels;
    int maxWeight;

    public void setWheels(int wh) {
        this.wheels = wh;
        System.out.println("Новое количество колес: " + this.wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Вес грузовика " + model + " составляет " + weight + "кг."+
                "\nЦвет грузовика - " + color + " и его скорость - " + speed+
                "\nКоличество колес "+wheels+" Максимальная масса "+maxWeight;
    }

    public static void main(String[] args) {
        Truck tr1 = new Truck(1000, "KAMAZ", 'B', 82.5f, 6, 2000);
        System.out.println(tr1);
        tr1.outPut();
        tr1.setWheels(8);
        System.out.println(tr1);
    }
}
