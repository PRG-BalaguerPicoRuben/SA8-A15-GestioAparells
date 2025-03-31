/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells.dispositius;

import sa8.a15.gestioaparells.Dispositiu;

/**
 *
 * @author batoi
 */
public class Computador extends Dispositiu{
    
    private int memoriaRam;
    private int velocitatCPU;
    private int grandariaDisco;

    public Computador(int numSerie, boolean teCorrentElectrica, boolean estaEnces,int memoriaRam, int velocitatCPU, int grandariaDisco) {
        super(numSerie, teCorrentElectrica, estaEnces);
        this.memoriaRam = memoriaRam;
        this.velocitatCPU = velocitatCPU;
        this.grandariaDisco = grandariaDisco;
    }
    
    
}
