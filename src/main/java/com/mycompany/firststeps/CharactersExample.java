/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firststeps;

/**
 *
 * @author ResetStoreX
 */
public class CharactersExample {
    public static void main(String[] args) {
        char character = 'a'; // utliza comillas simples
        System.out.println(character);
        //en char representa los caracteres de la tabla ACSII 
        char ASCI = 65;          
        
        char secondChar = (char) (ASCI + 1);
        
        System.out.println(secondChar);
        
        
        String palabra = "Alura cursos Online";
        
        
        System.out.println(palabra + " 2023");
    }
}
