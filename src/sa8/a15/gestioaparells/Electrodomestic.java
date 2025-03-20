/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sa8.a15.gestioaparells;

import static sa8.a15.gestioaparells.consumEnergetic.A;

/**
 *
 * @author batoi
 */
public abstract class Electrodomestic {

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
    
    public double obtindrePreuVenda() {
        double preuVenda = this.preBase;
        
        switch(lletraConsum){
            case A:
                preuVenda += 100;
                break;
            case B:
                preuVenda += 80;
                break;
            case C:
                preuVenda += 60;
                break;
            case D:
                preuVenda += 50;
                break;
            case E:
                preuVenda += 30;
                break;
            case F:
                preuVenda += 10;
                break;
        }
        return preuVenda;
    }
    
    
    
    
}
