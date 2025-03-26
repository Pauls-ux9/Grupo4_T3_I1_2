/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad;

import java.util.Arrays;

public class Modelo {
   private int[] vector;

    // Constructor para definir tamaño del vector
    public Modelo(int tamaño) {
        vector = new int[tamaño];
    }

    // Método para ingresar datos al vector
    public void setDato(int indice, int valor) {
        if (indice >= 0 && indice < vector.length) {
            vector[indice] = valor;
        }
    }

    // Método para encontrar el mayor número
    public int getMayor() {
        return Arrays.stream(vector).max().orElse(Integer.MIN_VALUE);
    }

    // Método para obtener todo el vector como String
    public String[] getDatos() {
        return Arrays.stream(vector).mapToObj(String::valueOf).toArray(String[]::new);
    }
}
    
   

