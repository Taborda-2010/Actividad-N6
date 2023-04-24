package com.mycompany.ex_10;
public class Matricula {
    double patrimonio, estrato,pagmat;
    Matricula (double patrimonio, double estrato){
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        
       
    }
        double pagmat(){
            pagmat = 50000;
        if ((patrimonio > 2000000) && (estrato > 3)) {
            pagmat = pagmat + 0.03 * patrimonio;
        }    
        return pagmat;
            
        }
        
    
    
}
