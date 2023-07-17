package service;

import entities.Client;
import entities.Routine;

import java.util.ArrayList;
import java.util.Scanner;

//crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
//        obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
//        actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
//        de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
//        eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
//        En el método principal (main):
public class RoutineService {
    private ArrayList<Routine> routines = new ArrayList<Routine>();

    public Routine routineRegister(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Routine r;
        r = new Routine();
//        private int id, duration, difficulty;
//        private String name;
        System.out.println("Please insert routine id: ");
        r.setId(scanner.nextInt());
        System.out.println("Please insert routine name: ");
        r.setName(scanner.next());
        System.out.println("Please insert routine duration: ");
        r.setDuration(scanner.nextInt());
        System.out.println("Please insert routine difficulty: ");
        r.setDifficulty(scanner.nextInt());
        System.out.println("Please insert routine description: ");
        r.setDescription(scanner.next());
        routines.add(r);
        return r;
    }

    public void getRoutines(){
        System.out.println(routines);
    }
    public boolean updateRoutine(int id, String name, int duration, int difficulty, String description){
        boolean findRoutine = false;
        for (Routine r: routines) {
            if (r.getId() == id){
                r.setName(name);
                r.setDuration(duration);
                r.setDifficulty(difficulty);
                r.setDescription(description);
                findRoutine = true;
            }
        }
        return findRoutine;
    }
    public boolean deleteRoutine(int id){
        boolean findRoutine = false;
        for (Routine r: routines) {
            if (r.getId() == id){
                routines.remove(r);
                findRoutine = true;
            }
        }
        return findRoutine;
    }

}
