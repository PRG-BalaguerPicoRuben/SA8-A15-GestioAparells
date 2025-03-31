/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells.Electrodomestics;

import sa8.a15.gestioaparells.Electrodomestic;
import sa8.a15.gestioaparells.color;
import sa8.a15.gestioaparells.consumEnergetic;

/**
 *
 * @author batoi
 */
public class Televisio extends Electrodomestic{
    
    private boolean ences;
    private boolean estaWifiHabilitat;
    private boolean estaConectadaAInternet;
    private double resolucio;
    
    public Televisio(boolean estaConectadaAInternet, double resolucio, int preBase, color colorElectro, consumEnergetic lletraConsum, double pes, boolean estWifiHabilitat ,boolean ences) {
        super(preBase, colorElectro, lletraConsum, pes);
        this.ences = ences;
        this.estaWifiHabilitat = estaWifiHabilitat;
        this.estaConectadaAInternet = estaConectadaAInternet;
        this.resolucio = resolucio;
    }
    
    public Televisio(int preBase, boolean estaConectadaAInternet, double resolucio, color colorElectro, consumEnergetic lletraConsum, boolean estWifiHabilitat ,boolean ences, double pes) {
        super(preBase, colorElectro, lletraConsum, pes);
        this.ences = false;
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.resolucio = 20;
    }
    
    @Override
    public double obtindrePreuVenda(){
        double multiplicador;
        if(resolucio > 40){
            multiplicador = 1.3;
        } else {
            multiplicador = 1;
        }
        return super.obtindrePreuVenda() * multiplicador;
    }
    
    
    
}
