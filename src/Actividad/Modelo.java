/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad;

import java.util.Arrays;

public class Modelo {
   private int[] vector;

    
    public Modelo(int tamaño) {
        vector = new int[tamaño];
    }

    
    public void setDato(int indice, int valor) {
        if (indice >= 0 && indice < vector.length) {
            vector[indice] = valor;
        }
    }

    
    public int getMayor() {
        return Arrays.stream(vector).max().orElse(Integer.MIN_VALUE);
    }

    
    public String[] getDatos() {
        return Arrays.stream(vector).mapToObj(String::valueOf).toArray(String[]::new);
    }
}
    
   

