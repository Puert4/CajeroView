/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroview;

import com.mycompany.cajerocontrol.Encriptacion;

/**
 * prueba
 * @author asielapodaca
 */
public class Main {
    
    public static void main (String [] args){
        Encriptacion encriptacion = new Encriptacion();
        String contra = encriptacion.cifrado("hola");
        System.out.println(contra);
        contra = encriptacion.descifrado(contra);
        System.out.println(contra);
    }
    
}
