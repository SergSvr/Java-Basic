package lesson6.task1;

public class BankEmployee extends Human {
    public String bank;

    public BankEmployee(String n, String s) {
        super(n, s);
    }

    public BankEmployee(String n, String s, String b) {
        super(n, s);
        this.bank=b;
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
        BankEmployee cl1 = new BankEmployee("Ivan", "Ivanov", "");
        cl1.setBank("VTB24");
        BankEmployee cl2 = new BankEmployee("Ivan", "Ivanov","Sber");
        System.out.println(cl1.toString());
        System.out.println(cl1.getFullName());
        System.out.println(cl2.toString());
        System.out.println();
    }
}
