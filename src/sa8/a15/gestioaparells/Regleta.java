/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells;
import java.util.ArrayList;
/**
 *
 * @author batoi
 */
public abstract class Regleta implements Endollable{
     private ArrayList<Endollable> endollats;
    private static final int MAX_ENDOLLS = 10;
    
    public Regleta() {
        endollats = new ArrayList<>();
    }
    
    public boolean endollar(Endollable aparell) {
        if (endollats.size() >= MAX_ENDOLLS) {
            System.out.println("Regleta plena! No es pot endollar.");
            return false;
        }
        if (endollats.contains(aparell)) {
            System.out.println("Aquest aparell ja està endollat.");
            return false;
        }
        endollats.add(aparell);
        aparell.donarEnergia();
        return true;
    }
    
    public boolean desendollar(Endollable aparell) {
        if (endollats.contains(aparell)) {
            aparell.llevarEnergia();
            endollats.remove(aparell);
            return true;
        } else {
            System.out.println("Aquest aparell no està endollat.");
            return false;
        }
    }
    
    public void mostrarEndollats() {
        System.out.println("Aparells endollats: " + endollats);
        System.out.println("Preses lliures: " + (MAX_ENDOLLS - endollats.size()));
    }
}
    
