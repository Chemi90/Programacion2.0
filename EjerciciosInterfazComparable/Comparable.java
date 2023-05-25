package EjerciciosInterfazComparable;

import java.util.ArrayList;
import java.util.Collections;

class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int edad;
    
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public int compareTo(Alumno otroAlumno) {
        return this.nombre.compareTo(otroAlumno.getNombre());
    }
}