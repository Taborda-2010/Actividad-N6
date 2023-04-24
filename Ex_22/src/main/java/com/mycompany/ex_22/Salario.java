package com.mycompany.ex_22;
public class Salario {
    double HorasT, PagoH;
    Salario(double Horast, double PagoH){
        this.HorasT = HorasT;
        this.PagoH = PagoH;
        
    }
    String generar(){
        Double Salario;
        
        Salario = HorasT * PagoH;
        
        if (Salario>450000){
            String R = Double.toString(Salario);
            return R;
        }
        else{
            String R ="No Disponible";
            return R;
        }
    }
    
}
