/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_41;

/**
 *
 * @author pipet
 */
public class Valores {
    double a, b;
    Valores(double a, double b){
        this.a = a;
        this.b = b;
    }
    String probar(){
        if (a>b){
            return "A es mayor que B"; 
        }
        
        else if (a<b){
            return "A es menor que B";
        }
        else{
            return "A es igual que B";
        }
        
        
        
    }
    
}
