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
public class n_Sonda extends Nave {

    private String material;
    private float peso;

    public n_Sonda() {
    }

    public n_Sonda(String material, float peso, int numserie, Planeta planeta, float velocidad) {
        super(numserie, planeta, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.numserie + " ";
    }

    @Override
    public void calcularTiempo() {
        int[] vuelta;
        int ida;
        int regreso;
        
    }

}
