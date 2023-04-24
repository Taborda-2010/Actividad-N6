package com.mycompany.ex_40;
public class Operaciones {
    double N;
    Operaciones( double N){
        this.N = N;
    }
    double raiz(){
        double S;
        S = Math.sqrt(N);
        return S;
    }
    
    double cuadrado(){
        double S;
        S = Math.pow(N,2);
        return S;
        
    }
    double cubo(){
        double S;
        S = Math.pow(N,3);
        return S;
        
    }
}
