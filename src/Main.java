import entities.Client;
import service.ClientService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ClientService cs = new ClientService();
        Client c1 = cs.clientRegister();

        //cs.clientRegister();
        cs.clientRegister2();
        cs.getClients();
        cs.updateClient(2,10,10,10,"10","10");
        cs.getClients();
        cs.deleteClient(1);
        cs.getClients();
    }
}