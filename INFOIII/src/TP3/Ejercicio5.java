/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3;

/**
 *
 * @author nacho
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        int[] info = {3,5,7,9,11,13,15};
        mostrar_matriz(info, info.length);
    }
    
    public static void mostrar_matriz(int[] datos, int tam){
        if(tam != 0){
        
        System.out.println(datos[tam-1]);
        
        mostrar_matriz(datos, tam-1);
        }
        /*if(tam == 0)
            return;
        System.out.println(datos[tam-1]);
        
        mostrar_matriz(datos, tam-1);
        */
           
    }
        
}
