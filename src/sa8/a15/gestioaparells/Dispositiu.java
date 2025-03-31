/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells;

/**
 *
 * @author batoi
 */
public abstract class Dispositiu extends AparellElectric implements Activable, Connectable{
        private boolean conectatAInternet;
        
        public Dispositiu(int numSerie, boolean teCorrentElectric, boolean estaEnces){
            super(numSerie, teCorrentElectric, estaEnces);
        }
}
