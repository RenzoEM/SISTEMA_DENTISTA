/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author CARLOS
 */
class Paciente {
    private String nombre;
    private int edad;
    private String problema;
 public Paciente(String nombre, int edad, String problema) {
        this.nombre = nombre;
        this.edad = edad;
        this.problema = problema;
    }

    // Método para obtener los datos del paciente como cadena de texto
    public String obtenerDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Problema: " + problema;
    }
}