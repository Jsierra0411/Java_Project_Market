package com.example.parcial_java_jorge_sierra;

import java.util.Objects;

public class CajaRetiro extends Caja {

    private double cantidadDineroCobradoEfectivo;
    private int cantUnidadesProductoCobrado;
    private String categoria;

    public CajaRetiro(Persona persona, double cantidadDinero, int cantidadTicketsDia, boolean aceptaTarjetasCredito, double cantidadDineroCobradoEfectivo, int cantUnidadesProductoCobrado, String categoria) {
        super(persona, cantidadDinero, cantidadTicketsDia, aceptaTarjetasCredito);
        this.cantidadDineroCobradoEfectivo = cantidadDineroCobradoEfectivo;
        this.cantUnidadesProductoCobrado = cantUnidadesProductoCobrado;
        this.categoria = categoria;
    }

    public double getCantidadDineroCobradoEfectivo() {
        return cantidadDineroCobradoEfectivo;
    }

    public void setCantidadDineroCobradoEfectivo(double cantidadDineroCobradoEfectivo) {
        this.cantidadDineroCobradoEfectivo = cantidadDineroCobradoEfectivo;
    }

    public int getCantUnidadesProductoCobrado() {
        return cantUnidadesProductoCobrado;
    }

    public void setCantUnidadesProductoCobrado(int cantUnidadesProductoCobrado) {
        this.cantUnidadesProductoCobrado = cantUnidadesProductoCobrado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean esRapida() {
        return Objects.equals(categoria, "rápida");
    }
}
