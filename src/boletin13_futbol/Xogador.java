/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_futbol;

/**
 *
 * @author lvazquezdorna
 */
public class Xogador extends Plantilla {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    
    
    public void xogarPartido() {

    }

    public void entrenar() {

    }

}
