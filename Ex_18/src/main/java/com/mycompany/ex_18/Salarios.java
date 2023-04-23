package com.mycompany.ex_18;
public class Salarios {
    double HorasT, ValorHora, Retencion;
    
    Salarios(double HorasT, double ValorHora, double Retencion){
        this.HorasT = HorasT;
        this.ValorHora = ValorHora;
        this.Retencion = Retencion;
    }
   
    
    double SalarioBruto(){
        double Sb;
        Sb = HorasT * ValorHora;
        return Sb;
    }
    
    double SalarioNeto(){
        double Sn, r, Sb;
        Sb = HorasT * ValorHora;
        r = Sb * (Retencion/100);
        Sn = Sb - r;
        return Sn;
 
    }
    
}
