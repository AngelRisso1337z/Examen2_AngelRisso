/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_angelrisso_11641026;

public class Planeta {
    private String nombre;
    private float temperatura;
    private boolean anillos;
    private String superficie;
    private float distancia;

    public Planeta() {
    }

    public Planeta(String nombre, float temperatura, boolean anillos, String superficie, float distancia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
