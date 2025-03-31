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
public class Encaminador {
    private ArrayList<Connectable> aparells;
    private static final int MAX_CONNS = 5;
    
    public Encaminador() {
        aparells = new ArrayList<>();
    }
    
    public boolean aparellar(Connectable aparell) {
        if (aparells.size() < MAX_CONNS && aparell.esPermetConnexio()) {
            aparells.add(aparell);
            aparell.establirConnexio();
            return true;
        }
        return false;
    }
    
    public boolean desaparellar(Connectable aparell) {
        if (aparells.contains(aparell)) {
            aparell.llevarConnexio();
            aparells.remove(aparell);
            return true;
        }
        return false;
    }
}
