package EjercicioArrayListTreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<String> lista = new ArrayList<>();

		// Agregar elementos al ArrayList
		lista.add("Juan");
		lista.add("María");
		lista.add("Pedro");
		lista.add("Ana");
		lista.add("Carlos");

		// Obtener un elemento por índice
		String primerElemento = lista.get(0);
		System.out.println("Primer elemento: " + primerElemento);

		// Reemplazar un elemento en el ArrayList
		lista.set(1, "Luisa");

		// Eliminar un elemento del ArrayList
		lista.remove(3);

		// Verificar si el ArrayList contiene un elemento
		boolean contieneAna = lista.contains("Ana");
		System.out.println("¿Contiene a Ana? " + contieneAna);

		// Verificar si el ArrayList está vacío
		boolean estaVacio = lista.isEmpty();
		System.out.println("¿Está vacío? " + estaVacio);

		// Obtener el tamaño del ArrayList
		int tamaño = lista.size();
		System.out.println("Tamaño: " + tamaño);

		// Agregar todos los elementos de otra colección al ArrayList
		ArrayList<String> otraLista = new ArrayList<>();
		otraLista.add("Laura");
		otraLista.add("Mario");
		lista.addAll(otraLista);

		// Obtener el índice de un elemento en el ArrayList
		int indice = lista.indexOf("Luisa");
		System.out.println("Índice de Luisa: " + indice);

		// Ordenar el ArrayList de forma ascendente
		Collections.sort(lista);

		// Imprimir los elementos del ArrayList ordenados
		System.out.println("Elementos del ArrayList ordenados:");
		for (String elemento : lista) {
			System.out.println(elemento);
		}

		// TreeSet
		TreeSet<Integer> conjunto = new TreeSet<>();

		// Agregar elementos al TreeSet
		conjunto.add(10);
		conjunto.add(5);
		conjunto.add(8);
		conjunto.add(12);
		conjunto.add(3);

		// Obtener el primer elemento del TreeSet
		int primerElementoSet = conjunto.first();
		System.out.println("Primer elemento del TreeSet: " + primerElementoSet);

		// Obtener el último elemento del TreeSet
		int ultimoElementoSet = conjunto.last();
		System.out.println("Último elemento del TreeSet: " + ultimoElementoSet);

		// Verificar si el TreeSet contiene un elemento
		boolean contieneOcho = conjunto.contains(8);
		System.out.println("¿Contiene el número 8? " + contieneOcho);

		// Verificar si el TreeSet está vacío
		boolean setVacio = conjunto.isEmpty();
		System.out.println("¿El TreeSet está vacío? " + setVacio);

		// Obtener el tamaño del TreeSet
		int tamañoSet = conjunto.size();
		System.out.println("Tamaño del TreeSet: " + tamañoSet);

		// Eliminar un elemento del TreeSet
		conjunto.remove(5);

		// Obtener el siguiente elemento más grande que 8
		int siguienteElemento = conjunto.higher(8);
		System.out.println("Siguiente elemento más grande que 8: " + siguienteElemento);

		// Obtener una vista del TreeSet que está comprendida entre 3 y 10
		TreeSet<Integer> subSet = (TreeSet<Integer>) conjunto.subSet(3, 10);
		System.out.println("Subconjunto: " + subSet);
	}
}
