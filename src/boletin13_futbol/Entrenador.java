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
public class Entrenador extends Plantilla {

    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public Entrenador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    
    
    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {
    }

}
