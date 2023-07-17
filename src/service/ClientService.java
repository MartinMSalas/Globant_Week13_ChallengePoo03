package service;

import entities.Client;

import java.util.ArrayList;
import java.util.Scanner;

//registrarCliente: lo registra en el sistema.
//        obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
//        actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
//        de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
//        eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema
public class ClientService {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public Client clientRegister(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Client c1;
        c1 = new Client();
        System.out.println("Please insert client id: ");
        c1.setId(scanner.nextInt());
        System.out.println("Please insert client age: ");
        c1.setAge(scanner.nextInt());
        System.out.println("Please insert client heigh: ");
        c1.setHeigh(scanner.nextDouble());
        System.out.println("Please insert client weight: ");
        c1.setWeight(scanner.nextDouble());
        System.out.println("Please insert client name: ");
        c1.setName(scanner.next());
        System.out.println("Please insert client objective: ");
        c1.setObjective(scanner.next());
        clients.add(c1);
        return c1;
    }
    public void clientRegister2(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int id,age;
        double heigh, weight;
        String name, objective;
        System.out.println("Please insert client id: ");
        id = scanner.nextInt();
        System.out.println("Please insert client age: ");
        age = scanner.nextInt();
        System.out.println("Please insert client heigh: ");
        heigh = scanner.nextDouble();
        System.out.println("Please insert client weight: ");
        weight = scanner.nextDouble();
        System.out.println("Please insert client name: ");
        name = scanner.next();
        System.out.println("Please insert client objective: ");
        objective = scanner.next();
        Client c = new Client(id,age,heigh,weight,name,objective);
        clients.add(c);
    }
    public void getClients(){

        System.out.println(clients);
    }
    public boolean updateClient(int id, int age,double heigh, double weight,String name, String objective){
        boolean findClient = false;
        for (Client client:clients
             ) {
            if(client.getId() == id){
                client.setAge(age);
                client.setHeigh(heigh);
                client.setWeight(weight);
                client.setName(name);
                client.setObjective(objective);
                findClient = true;
            }
        }
        return findClient;
    }
    public boolean deleteClient(int id){
        boolean findClient = false;
        for (Client client:clients
        ) {
            if(client.getId() == id){
                clients.remove(client);
                findClient= true;
            }
        }
        return findClient;
    }
}
