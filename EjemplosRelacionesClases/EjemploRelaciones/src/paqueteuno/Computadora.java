/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Computadora {

    private String tipoProcesador;
    private UnidadDVD unidadDvd;

    public Computadora(String a, UnidadDVD unidad) {
        tipoProcesador = a;
        unidadDvd = unidad;
    }

    Computadora(String procesador, int unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void establecerTipoProcesador(String aut) {
        tipoProcesador = aut;
    }

    public void establecerUnidadDvd(UnidadDVD u) {
        unidadDvd = u;
    }

    public String obtenerTipoProcesador() {
        return tipoProcesador;
    }

    public UnidadDVD obtenerUnidadDvd() {
        return unidadDvd;
    }

}
