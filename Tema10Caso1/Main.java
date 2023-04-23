package Tema10Caso1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		try {
		      // Crear un objeto FileWriter para escribir en el archivo de texto
		      FileWriter writer = new FileWriter(".//src/Tema10Caso1/miArchivo.txt");

		      // Crear un objeto BufferedWriter para mejorar el rendimiento de escritura
		      BufferedWriter buffer = new BufferedWriter(writer);

		      // Pedir al usuario que ingrese texto para escribir en el archivo
		      System.out.println("Ingrese el texto que desea escribir en el archivo:");
		      String input = sc.nextLine();

		      // Escribir el texto en el archivo de texto hasta que el usuario escriba "salir"
		      while (!input.equals("salir")) {
		        buffer.write(input + "\n");
		        input = sc.nextLine();
		      }

		      // Cerrar el objeto BufferedWriter y FileWriter para liberar recursos
		      buffer.close();
		      writer.close();

		      System.out.println("El archivo se ha creado y se ha escrito el texto correctamente.");
		    } catch (IOException e) {
		      System.out.println("Se ha producido un error al intentar escribir en el archivo de texto.");
		      e.printStackTrace();
		    }
		sc.close();
		
		try {
		      // Crear un objeto FileReader para leer el archivo de texto
		      FileReader reader = new FileReader(".//src/Tema10Caso1/miArchivo.txt");

		      // Crear un objeto BufferedReader para mejorar el rendimiento de lectura
		      BufferedReader buffer = new BufferedReader(reader);

		      // Leer el archivo de texto línea por línea y mostrarlo en la consola
		      String line = buffer.readLine();
		      while (line != null) {
		        System.out.println(line);
		        line = buffer.readLine();
		      }
		      System.out.println("El archivo se ha leido correctamente.");
		      // Cerrar el objeto BufferedReader y FileReader para liberar recursos
		      buffer.close();
		      reader.close();

		    } catch (IOException e) {
		      System.out.println("Se ha producido un error al intentar leer el archivo de texto.");
		      e.printStackTrace();
		    }
	}
}
