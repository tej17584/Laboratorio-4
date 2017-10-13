// CC2006, Lab 4
// Una clase para representar a los Coroneles.
/**
 * Esta clase tiene el comportamiento d eun coronel, que es extension de Teniente
 * @author Jose Tejada
 */
public class Coronel extends Teniente {
    /**
     * Este metodo nos retorna el salario de un Teniente
     * @return un double con el salario de un Coronel
     */
    @Override
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    /**
     * Este metodo ejecuta una orden de maniobra tipica de un coronel
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
