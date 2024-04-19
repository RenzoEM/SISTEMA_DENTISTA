/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de pacientes dentales");

        // Ingresar datos del paciente
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del paciente:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el problema dental del paciente:");
        String problema = scanner.nextLine();

        // Crear un objeto Paciente con los datos ingresados
        Paciente paciente = new Paciente(nombre, edad, problema);

        // Mostrar los datos del paciente
        System.out.println("\nDatos del paciente:");
        System.out.println(paciente.obtenerDatos());

        // Almacenar los datos en un archivo
        try {
            FileWriter fileWriter = new FileWriter("pacientes.txt", true); // true para añadir al archivo existente
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(paciente.obtenerDatos());
            printWriter.close();
            System.out.println("Los datos del paciente han sido guardados en el archivo pacientes.txt");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al intentar guardar los datos en el archivo.");
            e.printStackTrace();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
    

