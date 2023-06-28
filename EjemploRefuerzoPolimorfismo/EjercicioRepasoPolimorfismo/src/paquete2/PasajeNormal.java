/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete3.*;

/**
 *
 * @author reroes
 */
public class PasajeNormal extends PasajeUrbano {
    
    public PasajeNormal(double pasaje){
        super(pasaje);
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void establecerValorPasaje() {
        
        valorPasaje = valorFijo;
        
    }
    
    
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString()
                );
    }
}
