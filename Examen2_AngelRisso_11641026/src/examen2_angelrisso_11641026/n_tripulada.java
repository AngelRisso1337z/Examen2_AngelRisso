/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_angelrisso_11641026;

import java.util.ArrayList;

/**
 *
 * @author HP_AMD_64
 */
public class n_tripulada extends Nave {

    private String origen;
    private ArrayList<Astronauta> tripulacion = new ArrayList();

    public n_tripulada() {
    }

    public n_tripulada(String origen, int numserie, Planeta planeta, float velocidad) {
        super(numserie, planeta, velocidad);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public ArrayList<Astronauta> getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(ArrayList<Astronauta> tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void setTripulacion(Astronauta a) {
        this.tripulacion.add(a);
    }

    @Override
    public String toString() {
        return super.numserie + " ";
    }

    @Override
    public float[] calcularTiempo() {
        float vuelta[] = new float[1];
        float peso, ida, regreso;
        float distancia = planeta.getDistancia();
        for (Astronauta as : tripulacion) {
            peso = as.getPeso();
        }

        return vuelta;
    }

}
