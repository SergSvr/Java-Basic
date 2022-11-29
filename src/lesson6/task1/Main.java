package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Client cl1=new Client("Peter","Griffin","VTB24");
        ClientInterface cliInt=new ClientInterfaceImpl();
        System.out.println(cl1);
        System.out.println(cliInt.checkBank("VTB24",cl1));
        cl1=cliInt.setNameInt(cl1,"Vasiliy");
        System.out.println(cl1);
    }
}
