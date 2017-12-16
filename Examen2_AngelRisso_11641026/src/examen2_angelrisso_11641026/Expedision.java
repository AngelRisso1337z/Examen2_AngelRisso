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

    public Expedision() {
    }

    public Expedision(JLabel texto, float espera_ida, float espera_vuelta) {
        this.texto = texto;
        this.espera_ida = espera_ida;
        this.espera_vuelta = espera_vuelta;
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

    public float getEspera_ida() {
        return espera_ida;
    }

    public void setEspera_ida(float espera_ida) {
        this.espera_ida = espera_ida;
    }

    public float getEspera_vuelta() {
        return espera_vuelta;
    }

    public void setEspera_vuelta(float espera_vuelta) {
        this.espera_vuelta = espera_vuelta;
    }

    @Override
    public void run() {
        try {
            texto.setText("viajando");
            Thread.sleep((long) espera_ida);
            texto.setText("llego al planeta destino");
            Thread.sleep(800);
            texto.setText("regresando al la Tierra");
            Thread.sleep((long)espera_vuelta);
            texto.setText("ESTAMOS DE VUELTA");
        } catch (InterruptedException e) {
        }
        
    }
}
