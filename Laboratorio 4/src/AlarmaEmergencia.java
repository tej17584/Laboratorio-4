/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class AlarmaEmergencia extends Alarma{
    /**
     * Este metodo imprime un emergencia
     */
    @Override
    public void m1(){
        System.out.println("emergencia 1");
    }
    /**
     * Este metodo tiene 2 super de su super clase que es Alarma e invoca a uno de Timbre tambien
     * 
     */
    @Override
    public void m2(){
        super.m1();
        super.m2();
    }
    /**
     * Método toString para imprimir algo
     * @return un String propio con uno herdado
     */
    @Override
    public String toString(){
      return "emergencia "+ super.toString();
    }
    
}
