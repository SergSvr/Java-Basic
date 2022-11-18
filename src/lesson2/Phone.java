package lesson2;


public class Phone {
    private Brand brand;
    private String model;
    private double price;
    private double screenSize;
    private String charger;

    public Phone() {
        System.out.println("No parameters provided");
    }

    public Phone(Brand brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.charger = "5W";//default value
    }

    public Phone(Brand brand, String model, double price, double scr, String chr) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = scr;
        this.charger = chr;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String toString() {
        String scr;
        if (screenSize == 0)
            scr = Double.toString(screenSize);
        else
            scr = "not set";
        return "This phone is " + brand + " " + model + " price is " + price + " Screensize " + scr + " Charger " + charger;
    }

    public static void main(String[] args) {
    }
}
