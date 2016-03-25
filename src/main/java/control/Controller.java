package control;
import model.Operations;
import model.TDistribution;

/**
 * clase para gestionar las operaciones para el c�lculo de la integraci�n numerica de la distribuci�n T  
 * @class  Controller
 * @author Carolina Caceres
 */
public class Controller {

    /**
     * Metodod que retorna la distribuci�n T con el valor num�rico de integracion p
     * @method IntegrationFunction
     * @param t TDistribution t
     * @return valor TDistribution t
     */
    public static TDistribution IntegrationFunction(TDistribution t) {
        double valor1 = Operations.NumericalIntegration(t);
        t.setNumSeg(t.getNumSeg() * 2);
        t.setWidthSegment(t.getxValue() / t.getNumSeg());
        double valor2 = Operations.NumericalIntegration(t);
        if (valor1 - valor2 < Math.E) {
            t.setP(valor2);
            return t;
        } else {
            return IntegrationFunction(t);
        }
    }
    
    
}
