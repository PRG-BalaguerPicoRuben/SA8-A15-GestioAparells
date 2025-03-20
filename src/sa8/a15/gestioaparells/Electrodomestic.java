/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sa8.a15.gestioaparells;

/**
 *
 * @author batoi
 */
public class Electrodomestic {

    private int numSerie;
    private int preBase;
    private String marca;
    private String model;
    private color colorElectro;
    private consumEnergetic lletraConsum;
    private double pes;

    public Electrodomestic(int preBase, color colorElectro, consumEnergetic lletraConsum, double pes) {
        this.preBase = 100;
        this.colorElectro = color.Blanc;
        this.lletraConsum = consumEnergetic.F;
        this.pes = 5;
    }
    
    
    
    
}
