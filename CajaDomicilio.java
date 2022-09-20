package com.example.parcial_java_jorge_sierra;

public class CajaDomicilio extends Caja implements Comparable {

   private int cantidadPedidosMes;
   private int cantidadCamionesDespachados;

   public CajaDomicilio(Persona persona, double cantidadDinero, int cantidadTicketsDia, boolean aceptaTarjetasCredito, int cantidadPedidosMes, int cantidadCamionesDespachados) {
      super(persona, cantidadDinero, cantidadTicketsDia, aceptaTarjetasCredito);
      this.cantidadPedidosMes = cantidadPedidosMes;
      this.cantidadCamionesDespachados = cantidadCamionesDespachados;
   }

   public int getCantidadPedidosMes() {
      return cantidadPedidosMes;
   }

   public void setCantidadPedidosMes(int cantidadPedidosMes) {
      this.cantidadPedidosMes = cantidadPedidosMes;
   }

   public int getCantidadCamionesDespachados() {
      return cantidadCamionesDespachados;
   }

   public void setCantidadCamionesDespachados(int cantidadCamionesDespachados) {
      this.cantidadCamionesDespachados = cantidadCamionesDespachados;
   }

   @Override
   public int compareTo(Object obj) {

      CajaDomicilio yObj = (CajaDomicilio) obj;
      int respuesta = 0;

      if(this.cantidadPedidosMes> yObj.getCantidadPedidosMes()){
         respuesta = 1;
      }

      if(this.cantidadPedidosMes < yObj.getCantidadPedidosMes()){
         respuesta = -1;
      }

      return respuesta;

   }
}
