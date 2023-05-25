package EjerciciosInterfazComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 20));
        alumnos.add(new Alumno("María", 22));
        alumnos.add(new Alumno("Pedro", 19));
        
        System.out.println("Antes de ordenar:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " - " + alumno.getEdad());
        }
        
        Collections.sort(alumnos);
        
        System.out.println("Después de ordenar:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " - " + alumno.getEdad());
        }
    }
}