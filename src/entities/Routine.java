package entities;
//Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
//        (cadena de caracteres)
//        Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
//        descripcion
public class Routine {
    private int id, duration, difficulty;
    private String name, description;

    public Routine() {
    }

    public Routine(int id, int duration, int difficulty, String name, String description) {
        this.id = id;
        this.duration = duration;
        this.difficulty = difficulty;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Routine{" +
                "id=" + id +
                ", duration=" + duration +
                ", difficulty=" + difficulty +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

