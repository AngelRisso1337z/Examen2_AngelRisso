/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_angelrisso_11641026;

/**
 *
 * @author HP_AMD_64
 */
public abstract class Nave {
    protected int numserie;
    protected Planeta planeta;
    protected float velocidad;

    public Nave() {
    }

    public Nave(int numserie, Planeta planeta, float velocidad) {
        this.numserie = numserie;
        this.planeta = planeta;
        this.velocidad = velocidad;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return numserie+" ";
    }
    public abstract void calcularTiempo();
    
}
