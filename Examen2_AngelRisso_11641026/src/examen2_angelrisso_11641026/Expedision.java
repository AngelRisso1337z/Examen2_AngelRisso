/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_angelrisso_11641026;

import javax.swing.JLabel;

/**
 *
 * @author HP_AMD_64
 */
public class Expedision extends Thread {

    private JLabel texto;
    private boolean vive = false;
    private boolean avanti = false;
    private float espera_ida;
    private float espera_vuelta;
    Planeta p;
    Nave n;

    public Expedision() {
    }

    public Expedision(JLabel texto, Planeta p,Nave n) {
        this.texto = texto;
        this.p=p;
        this.n=n;
        vive = true;
        avanti = true;
    }

    public JLabel getTexto() {
        return texto;
    }

    public void setTexto(JLabel texto) {
        this.texto = texto;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanti() {
        return avanti;
    }

    public void setAvanti(boolean avanti) {
        this.avanti = avanti;
    }

  

    @Override
    public void run() {
        float dist=p.getDistancia();
        float vel=n.getVelocidad();
        
        try {
            texto.setText("viajando");
            Thread.sleep((long)(dist/vel)*1000);
            texto.setText("llego al planeta destino");
            Thread.sleep(800);
            texto.setText("regresando al la Tierra");
            Thread.sleep((long)(9.8/vel)*1000);
            texto.setText("ESTAMOS DE VUELTA");
        } catch (InterruptedException e) {
        }
        
    }
}
