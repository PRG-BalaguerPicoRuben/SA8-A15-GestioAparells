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
    public String nom;
    private String numeroSerie;
    private boolean encés;
    
    public AparellElectric(String nom, String numeroSerie) {
        this.nom = nom;
        this.numeroSerie = numeroSerie;
        this.encés = false;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getNom() {
        return nom;
    }
    
    @Override
    public void donarEnergia() {
        encés = true;
        System.out.println(nom + " està encés.");
    }
    
    @Override
    public void llevarEnergia() {
        encés = false;
        System.out.println(nom + " està apagat.");
    }
    
    @Override
    public String toString() {
        return nom + " (S/N: " + numeroSerie + ")";
    }
}
