package lesson6.task1;

public class ClientInterfaceImpl implements ClientInterface{

    @Override
    public String checkBank(String bank, Client client) {
        if (client.bank==bank) return "Является клиентом банка "+bank;
        return "Не является клиентом банка"+bank;
    }

    @Override
    public Client setNameInt(Client client, String name) {
        client.name=name;
        return client;
    }
}
