package lesson2;


public class Phone {
    private Brand Brand;
    private String Model;
    private double Price;
    private double Screensize;
    private String Charger;

    public Phone() {
        System.out.println("No parameters provided");
    }

    public Phone(Brand brand, String model, double price) {
        this.Brand = brand;
        this.Model = model;
        this.Price = price;
        this.Screensize = 5.0;
        this.Charger = "5W";
    }

    public Phone(Brand brand, String model, double price, double scr, String chr) {
        this.Brand = brand;
        this.Model = model;
        this.Price = price;
        this.Screensize = scr;
        this.Charger = chr;
    }

    public void setCharger(String charger) {
        this.Charger = charger;
    }

    public String getCharger() {
        return Charger;
    }

    @Override

    public String toString() {
        return "This phone is " + Brand + " " + Model + " price is " + Price + " Screensize " + Screensize + " Charger " + Charger;
    }

    public static void main(String[] args) {
    }
}
