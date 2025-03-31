/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells;

/**
 *
 * @author batoi
 */
public abstract class AparellElectric implements Endollable{
    private int numSerie;
    private boolean teCorrentElectrica;
    private boolean estaEnces;

    public AparellElectric(int numSerie, boolean teCorrentElectrica, boolean estaEnces) {
        this.numSerie = numSerie;
        this.teCorrentElectrica = false;
        this.estaEnces = estaEnces;
    }
    
    @Override
    public void donarEnergia(){
        this.teCorrentElectrica = true;
    }
    
    @Override
    public void llevarEnergia(){
        this.teCorrentElectrica = false;
        this.estaEnces = false;
    }
    
    
}
