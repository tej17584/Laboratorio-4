// CC2006, Lab 4
// Una clase para representar a los Generales.
/**
 * ESta clase tiene el comportamiento de un general que siempr es militar
 * @author Jose Tejada
 */
public class General extends Militar {
    /**
     * Este metodo lo que hace es que nos da los dias de vacaiones de un general
     * @return un int con los dias de vacaiones
     */
    @Override
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }
    /**
     * Este metodo nos retonra el formulario del general
     * @return un String con el color del fomrulario
     */
    @Override
    public String getFormularioVacaciones() {
        return "rosado";
    }
    /**
     * Este metodo nos permite planificar una estrategia
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}
