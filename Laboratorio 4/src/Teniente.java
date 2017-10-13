// CC2006, Lab 4
// Una clase para representar a los Tenientes.
/**
 * Esta clase da el comportamiento de un teniente
 * @author Jose Tejada
 */
public class Teniente extends Militar {
    /**
     * Este metodo nos permite tomar una orden de un coronel 
     * @param texto un String con la orden del coronel
     */
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }
    
}
