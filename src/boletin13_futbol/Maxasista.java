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
public class Maxasista extends Plantilla {

    private String titulacion;
    private int anosExperiencia;

    public Maxasista() {
    }

    
    public Maxasista(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public Maxasista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    
    public void darMasaxes() {
    }
}
