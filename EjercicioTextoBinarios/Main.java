package EjercicioTextoBinarios;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el nombre del archivo txt: ");
		String nombreArchivo = sc.nextLine();
		crearArchivoTexto(nombreArchivo);
		System.out.print("Escribe el texto que vaya en el archivo txt: ");
		String texto = sc.nextLine();
		escribirArchivoTexto(texto, nombreArchivo);
		leerArchivoTexto(nombreArchivo);

		System.out.print("Introduce el nombre del archivo bin: ");
		String nombre = sc.nextLine();
		crearArchivoBinario(nombre);
		System.out.print("Escribe en el binario antes creado un numero entero: ");
		int numInt = sc.nextInt();
		System.out.print("Ahora el numero decimal: ");
		double numDecimal = sc.nextDouble();
		escribirArchivoBinario(numInt, numDecimal, nombre);
		leerArchivoBinario();
		
		sc.close();
	}

	public static void crearArchivoTexto(String nombreArchivo) {
		try {
			File file = new File(nombreArchivo);
			if (file.createNewFile()) {
				System.out.println("Archivo de texto creado exitosamente.");
			} else {
				System.out.println("El archivo de texto ya existe.");
			}
		} catch (IOException e) {
			System.out.println("Error al crear el archivo de texto.");
		}
	}

	public static void escribirArchivoTexto(String contenido, String nombreArchivo) {
		try (PrintWriter writer = new PrintWriter(nombreArchivo)) {
			writer.println(contenido);
			System.out.println("Se ha escrito en el archivo de texto.");
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el archivo de texto.");
		}
	}

	public static void leerArchivoTexto(String nombreArchivo) {
		try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo de texto.");
		}
	}

	public static void crearArchivoBinario(String nombre) {
		try {
			File file = new File(nombre);
			if (file.createNewFile()) {
				System.out.println("Archivo binario creado exitosamente.");
			} else {
				System.out.println("El archivo binario ya existe.");
			}
		} catch (IOException e) {
			System.out.println("Error al crear el archivo binario.");
		}
	}

	public static void escribirArchivoBinario(int entero, double decimal, String nombre) {
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(nombre))) {
			output.writeInt(entero);
			output.writeDouble(decimal);
			System.out.println("Se ha escrito en el archivo binario.");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo binario.");
		}
	}

	public static void leerArchivoBinario() {
		try (DataInputStream input = new DataInputStream(new FileInputStream("archivo.bin"))) {
			int intValue = input.readInt();
			double doubleValue = input.readDouble();
			System.out.println("Entero: " + intValue);
			System.out.println("Doble: " + doubleValue);
		} catch (IOException e) {
			System.out.println("Error al leer el archivo binario.");
		}
	}
}
