/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea5daimanyrocio;

/**
 *
 * @author rocio
 */
public class Tarea5DAimanyRocio {
    private int numero;
    private int pagina;

    public Tarea5DAimanyRocio(int numero, int pagina) {
        this.numero = numero;
        this.pagina = pagina;
    }

    public Tarea5DAimanyRocio() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea5DAimanyRocio{");
        sb.append("numero=").append(numero);
        sb.append(", pagina=").append(pagina);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
