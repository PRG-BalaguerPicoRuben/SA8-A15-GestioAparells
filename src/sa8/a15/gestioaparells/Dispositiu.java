/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa8.a15.gestioaparells;

/**
 *
 * @author batoi
 */
public abstract class Dispositiu extends AparellElectric implements Activable, Connectable{
    private String numeroSerie;
    private boolean encés;
    private boolean teCorrent;
    public boolean connectatInternet;

    public Dispositiu(boolean encés, boolean teCorrent, boolean connectatInternet, String nom, String numeroSerie) {
        super(nom, numeroSerie);
        this.numeroSerie = numeroSerie;
        this.encés = encés;
        this.teCorrent = teCorrent;
        this.connectatInternet = connectatInternet;
    }
    
    public void donarEnergia() {
        teCorrent = true;
    }
    
    public void llevarEnergia() {
        teCorrent = false;
        encés = false;
    }
    
    @Override
    public void activar() {
        if (teCorrent) {
            encés = true;
            System.out.println("Dispositiu encés.");
        } else {
            System.out.println("No es pot encendre sense corrent.");
        }
    }
    
    @Override
    public void desactivar() {
        encés = false;
        System.out.println("Dispositiu apagat.");
    }
    
    @Override
    public boolean esPermetConnexio() {
        return encés;
    }
    
    @Override
    public void establirConnexio() {
        if (esPermetConnexio()) {
            connectatInternet = true;
            System.out.println("Dispositiu connectat a Internet.");
        } else {
            System.out.println("No es pot connectar a Internet.");
        }
    }
    
    @Override
    public void llevarConnexio() {
        connectatInternet = false;
        System.out.println("Dispositiu desconnectat de Internet.");
    }
}
