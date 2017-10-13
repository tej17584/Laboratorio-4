// CC2006, Lab 4
// Una clase para representar a los militares en general.
/**
 * Clase que modela a los militares en geeneral con parametros
 * @author Jose Tejada
 */
public class Militar {
    /**
     * Este metodo retorna las horas que trabaja un militar
     * @return un int con la cantidad de horas
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    /**
     * Este metodo retorna el salario de un militar
     * @return un Double con el salario de un militar
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    /**
     * Este metodo retorna los dias de vacaiones
     * @return un int con los dias de vacaiones
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }
    /**
     * Este metodo nos retorna el tipo de formulario
     * @return un STring con el color del formulario
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}
