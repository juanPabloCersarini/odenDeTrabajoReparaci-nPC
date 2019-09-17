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
public class DispositivoEntrada extends Computadora{
    private boolean inalambrico;

    public DispositivoEntrada(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }
    
    public DispositivoEntrada(){
        
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }
    
    
}
