/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.leshuga.entidades;

import java.util.List;
import mx.itson.leshuga.enumeradores.Tipo;

/**
 *Atributos de un menú
 * @author gabrielaperezbello
 */
public class MenuDia {
    private String dia;
    private Tipo TipoSushi;
    private List<Sushi> sushis;
    

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Tipo getTipo() {
        return TipoSushi;
    }

    public void setTipo(Tipo estado) {
        this.TipoSushi = estado;
    }

    public List<Sushi> getSushi() {
        return sushis;
    }

    public void setSushi(List<Sushi> sushis) {
        this.sushis = sushis;
    }

    
}
