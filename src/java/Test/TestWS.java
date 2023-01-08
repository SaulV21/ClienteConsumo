/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import sv.Guia;
import sv.Guia_Service;
import sw.Consultas;
import sw.Consultas_Service;

/**
 *
 * @author Saul
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guia_Service servicio=new Guia_Service();
        Guia cliente=servicio.getGuiaPort();
        Consultas_Service server=new Consultas_Service();
        Consultas client=server.getConsultasPort();
        //Consumo primer servicio
        if(cliente.login("Admin", "1234")){
            System.out.println("Usuario aceptado");
        }else{
        System.out.println("Usuario denegado");
        }
        if(cliente.procesarPago(400, 200)!=-1){
            System.out.println("Pago aceptado");
            System.out.println("Su cambio es: $"+cliente.procesarPago(400, 200));
        }else{
        System.out.println("No hay suficiente saldo");
        }
        //Consumo segundo servicio
        System.out.println(client.dibujo("conejo"));
        System.out.println(client.diccionario("amor"));
        System.out.println(client.nombre("Raul"));
    }
    
}
