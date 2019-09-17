/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reparacionPC;

/**
 *
 * @author Juan Pablo
 */
public abstract class DispositivoSalida extends Computadora{
    private String modelo;

    public DispositivoSalida(String modelo) {
        this.modelo = modelo;
    }
    
    public DispositivoSalida(){
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
