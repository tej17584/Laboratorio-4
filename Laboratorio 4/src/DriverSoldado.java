/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta clase es para demostrar el comportamiento de un soldado promedio
 * @author Jose Tejada
 */
public class DriverSoldado {
    public static void main(String[] args) {
        Soldado soldadito= new Soldado();
        System.out.println("Bienvenido al curso sobre El Ejército, acá tienes la info de un soldado promedio");
        System.out.println("Días de vacaciones: "+soldadito.getDiasVacaciones());
        System.out.println("Salario: Q"+soldadito.getSalario());
        System.out.println("Horas de trabajo: "+soldadito.getHoras());
        System.out.println("Nuestros soldado reciben ordenes de la siguiente manera: ");
        soldadito.recibeOrden();
    }
}
