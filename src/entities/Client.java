package entities;
//Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
//        (cadena de caracteres)
//        Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
//        descripcion
public class Client {
    private int id,age;
    private double heigh, weight;
    private String name, objective;

    public Client() {
    }

    public Client(int id, int age, double heigh, double weight, String name, String objective) {
        this.id = id;
        this.age = age;
        this.heigh = heigh;
        this.weight = weight;
        this.name = name;
        this.objective = objective;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", age=" + age +
                ", heigh=" + heigh +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", objective='" + objective + '\'' +
                '}';
    }
}
