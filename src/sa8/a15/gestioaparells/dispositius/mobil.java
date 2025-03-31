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
public class mobil extends Dispositiu {
    private double numSerie;
    private int memoriaInterna;
    private String marcaMobil;
    private String model;

    public mobil(int numSerie, boolean teCorrentElectrica, boolean estaEnces,int memoriaInterna, String marcaMobil, String model) {
        super(numSerie, teCorrentElectrica, estaEnces);
        this.numSerie = numSerie;
        this.memoriaInterna = memoriaInterna;
        this.marcaMobil = marcaMobil;
        this.model = model;
    }
    
    
}
