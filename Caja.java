package com.example.parcial_java_jorge_sierra;

public class Caja {

    private Persona persona;
    private double CantidadDinero;
    private int CantidadTicketsDia;
    private boolean aceptaTarjetasCredito;

    public Caja(Persona persona, double cantidadDinero, int cantidadTicketsDia, boolean aceptaTarjetasCredito) {
        this.persona = persona;
        CantidadDinero = cantidadDinero;
        CantidadTicketsDia = cantidadTicketsDia;
        this.aceptaTarjetasCredito = aceptaTarjetasCredito;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getCantidadDinero() {
        return CantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        CantidadDinero = cantidadDinero;
    }

    public int getCantidadTicketsDia() {
        return CantidadTicketsDia;
    }

    public void setCantidadTicketsDia(int cantidadTicketsDia) {
        CantidadTicketsDia = cantidadTicketsDia;
    }

    public boolean isAceptaTarjetasCredito() {
        return aceptaTarjetasCredito;
    }

    public void setAceptaTarjetasCredito(boolean aceptaTarjetasCredito) {
        this.aceptaTarjetasCredito = aceptaTarjetasCredito;
    }

    public boolean retiroTickets() {
        return CantidadTicketsDia>=100;
    }
}
