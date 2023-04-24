package com.mycompany.figurasgeometricas;
public class TrianguloRectangulo {
    double baset, alturat;

    public TrianguloRectangulo(double baset, double alturat) {
        this.baset = baset;
        this.alturat = alturat;
    }

    double calcularHipotenusa() {
        return Math.pow(baset * baset + alturat * alturat, 0.5);
    }

    double calcularArea() {
        return (baset * alturat / 2);
    }

    double calcularPerimetro() {
        return (baset + alturat + calcularHipotenusa());
    }

    public static String determinarTipoTriangulo(double baset, double alturat, double calcularHipotenusa ) {
        if ((baset == alturat) && (baset == calcularHipotenusa) && (alturat == calcularHipotenusa)) {
            return"Es un triangulo equilatero";
        } 
        else if ((baset != alturat) && (baset != calcularHipotenusa) && (alturat != calcularHipotenusa)) {
            return "Es un triangulo escaleno";
        } 
        else {
            return "Es un triangulo isosceles";

        }
    }
    
}
