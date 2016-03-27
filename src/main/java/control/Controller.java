package control;
import model.Operations;
import model.TDistribution;

/**
 * clase para gestionar las operaciones para el calculo de la integracion numerica de la distribucion T  
 * Clase  Controller
 * @author Carolina Caceres
 */
public class Controller {

    /**
     * Metodo que retorna la distribucion T con el valor numerico de integracion p
     * Metodo IntegrationFunction
     * Parametro t TDistribution t
     * Retorna valor TDistribution t
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
