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
    private int memoriaInterna;
    private String marcaMobil;
    private String model;

     public mobil(String nom, String numeroSerie, boolean teCorrentElectrica, boolean estaEnces, boolean connectatInternet, int memoriaRam, int velocitatCPU, int grandariaDisco) {
        super(estaEnces, teCorrentElectrica, connectatInternet, nom, numeroSerie); // Corrección de la llamada a super()
        this.memoriaInterna = memoriaInterna;
        this.marcaMobil = marcaMobil;
        this.model = model;
    }
    
    
}
