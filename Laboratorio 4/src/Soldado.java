/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *ESta clase es una clase con comportamiento de soldado.
 * @author Jose Tejada
 */
public class Soldado extends Militar{
    /**
     * Este metodo nos retorna el salario de un soldado
     * @return un Dobule con el salario del soldado
     */
    @Override
    public double  getSalario(){
         return super.getSalario()-10000.0;//Le restamos 10000 a su salario porque gana solo 300000
    }
    /**
     * Este metodo nos retorna la cantidad de horas que trabaja un soldado
     * @return un int con la cantidad de horas que trabaja un solado que es el doble de los demas.
     */
    @Override
    public int getHoras(){
        return super.getHoras()*2;
    }
    /**
     * Este metodo nos retorna el numero de dias de vacaiones de un soldadoo
     * @return un int con el numero de dias de vacaiones de un solado que es la mitad.
     */
    @Override
    public int getDiasVacaciones(){
        return super.getDiasVacaciones()/2;
    }
    /**
     * Este metodo imprime una orden 
     */
    public void recibeOrden(){
        System.out.println("ORDENE MI GENERAL");
    }
    
}
