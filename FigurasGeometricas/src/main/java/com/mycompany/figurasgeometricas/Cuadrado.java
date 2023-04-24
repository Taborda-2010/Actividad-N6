package com.mycompany.figurasgeometricas;
public class Cuadrado {
    double ladoC;

    Cuadrado(double ladoC) {
        this.ladoC = ladoC;
    }

    double CalcuarArea() {
        return ladoC * ladoC;
    }

    double CalcularPerimetro() {
        return ladoC * 4;
    }

    
}
