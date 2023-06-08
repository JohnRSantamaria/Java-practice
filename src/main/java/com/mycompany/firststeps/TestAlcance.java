/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firststeps;

/**
 *
 * @author ResetStoreX
 */
public class TestAlcance {
    public static void main(String[] args) {
        System.out.println("pruebas condicionales");
        int edad = 20; 
        int cantidadPersonas = 3; 
        boolean acompañado; 
        
        if(cantidadPersonas >= 2 ){
            acompañado = true; 
        }else {
            acompañado = false;
        }
                
        if (edad >= 18 || acompañado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}
