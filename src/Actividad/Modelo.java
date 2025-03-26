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
        int mayor = vector[0];  
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];  
            }
        }
        return mayor;
    }

    
    public String[] getDatos() {
        String[] datos = new String[vector.length];

        for (int i = 0; i < vector.length; i++) {
            datos[i] = String.valueOf(vector[i]);  
        }
        return datos;
    }
    
}  