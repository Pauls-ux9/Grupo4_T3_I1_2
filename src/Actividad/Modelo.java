/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad;

import java.util.Arrays;

public class Modelo {
   private int[] vector;  // Vector de números

    // Constructor para definir el tamaño del vector
    public Modelo(int tamaño) {
        vector = new int[tamaño];  // Se crea el vector con el tamaño indicado
    }

    // Método para ingresar un número en una posición específica
    public void setDato(int indice, int valor) {
        if (indice >= 0 && indice < vector.length) {
            vector[indice] = valor;  // Guarda el número en la posición dada
        }
    }

    // Método para encontrar el número mayor en el vector
    public int getMayor() {
        int mayor = vector[0];  // Se asume que el primero es el mayor

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];  // Se actualiza si encuentra un número mayor
            }
        }
        return mayor;
    }

    // Método para obtener todos los números del vector en formato de texto
    public String[] getDatos() {
        String[] datos = new String[vector.length];

        for (int i = 0; i < vector.length; i++) {
            datos[i] = String.valueOf(vector[i]);  // Convierte cada número a texto
        }
        return datos;
    }
    
}  