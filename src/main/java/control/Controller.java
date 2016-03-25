package control;
import model.Operations;
import model.TDistribution;

/**
 * clase para gestionar las operaciones para el c�lculo de la integraci�n num�rica de la distribuci�n T  
 * @class  Controller
 * @author Carolina Caceres
 */
public class Controller {

    /**
     * M�todod que retorna la distribuci�n T con el valor num�rico de integraci�n p
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
