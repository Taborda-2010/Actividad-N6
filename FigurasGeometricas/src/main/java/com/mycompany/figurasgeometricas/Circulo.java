package com.mycompany.figurasgeometricas;
public class Circulo {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularperimetro() {
        return 2 * Math.PI * radio;
    }
    
}
