package com.mycompany.ex_19;
public class Triangulo {
    double lado;
    Triangulo(double lado){
        this.lado = lado;
    }
    
    double perimetro(){
        double p;
        p = lado*3;
        return p;
    }
    
    double altura(){
        double h;
        h = Math.sqrt(Math.pow(lado, 2) - Math.pow((lado / 2), 2));
        return h;
    }
    
    double area(){
        double a,h;
        h = Math.sqrt(Math.pow(lado, 2) - Math.pow((lado / 2), 2));
        a = (lado * h) / 2;
        return a;
        
    }
    
}
