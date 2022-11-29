package lesson6.task1;

public class Client extends Human {
    public String bank;

    public Client(String n, String s, String b) {
        super(n, s);
        this.bank=b;
    }

    public Client(String n, String s) {
        super(n, s);
    }
    @Override
    public String getFullName() {
        return "Bank Employee " + getName()+ " " + getSurname()+"Bank "+bank;
    }

    public void setAllValues(String n, String s, String bank) {
        this.name = n;
        this.surname = s;
        this.bank = bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank(String bank) {
        return this.bank;
    }

    public static void main(String[] args) {
        Client cl1 = new Client("Ivan", "Ivanov");
        cl1.setBank("VTB24");
        Client cl2 = new Client("Ivan", "Ivanov","Sber");
        System.out.println(cl1.getFullName());
        System.out.println(cl2.getFullName());
        System.out.println(cl1);
    }
}
