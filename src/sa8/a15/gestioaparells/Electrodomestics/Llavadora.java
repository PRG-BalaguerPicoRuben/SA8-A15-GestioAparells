/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells.Electrodomestics;

import sa8.a15.gestioaparells.Activable;
import sa8.a15.gestioaparells.Electrodomestic;
import sa8.a15.gestioaparells.color;
import sa8.a15.gestioaparells.consumEnergetic;

/**
 *
 * @author batoi
 */
public abstract class Llavadora extends Electrodomestic implements Activable{
    
    private boolean ences;
    private int carrega;
    
    public Llavadora(int preBase, color colorElectro, consumEnergetic lletraConsum, double pes, boolean ences) {
        super(preBase, colorElectro, lletraConsum, pes);
        this.ences = ences;
        this.carrega = carrega;
    }
    
    public Llavadora(int preBase, color colorElectro, consumEnergetic lletraConsum, boolean ences ,double pes) {
        super(preBase, colorElectro, lletraConsum, pes);
        this.ences = false;
        this.carrega = 7;
    }
    
    @Override
    public double obtindrePreuVenda(){
        double preuExtra = 0;
        if(this.carrega >= 10){
            carrega += 50;
        }
        return super.obtindrePreuVenda() + preuExtra;
    }
}