package model;

/**
 * Clase para gestionar las operaciones matem�ticas utilizadas en la integraci�n num�rica
 * @class Operations
 * @author Carolina Caceres
 */
public class Operations {

    public final static double ZERO = 0;
    public final static double MIDDLE = 0.5;
    public final static double ERROR = 0.00001;

    /**
     * M�todo para calcular la integraci�n num�rica de la distribuci�n t 
     * @method NumericalIntegration
     * @param t T Distribution 
     * @return valor p integraci�n num�rica
     */
    public static double NumericalIntegration(TDistribution t) {
        double valor = (t.getWidthSegment() / 3) * 1 * functionX(t.getxValue() * 0, t.getDof());
        for (int i = 1; i < t.getNumSeg(); i++) {
            if (i % 2 == 0) {
                valor = valor + (t.getWidthSegment() / 3) * 2 * functionX(t.getWidthSegment() * i, t.getDof());
            } else {
                valor = valor + (t.getWidthSegment() / 3) * 4 * functionX(t.getWidthSegment() * i, t.getDof());
            }
        }
        valor = valor + (t.getWidthSegment() / 3) * 1 * functionX(t.getxValue(), t.getDof());
        return valor;
    }

    /**
     * M�todo para calcular f(x) utilizando el proceso de integraci�n num�rica
     * @method functionX
     * @param x
     * @param dof
     * @return valor f(x)
     */
    public static double functionX(double x, int dof) {
        double fx;
        double x1 = 1 + ((Math.pow(x, 2)) / dof);
        double exp = (double) (dof + 1) / 2;
        x1 = Math.pow(x1, -exp);
        double x2 = gamaFucntion(exp) / (Math.pow(dof * Math.PI, MIDDLE) * gamaFucntion((double) dof / 2));
        fx = x2 * x1;
        return fx;
    }

    /**
     * M�todo para calcular la funci�n gamma del n�mero entero
     * @method gamaFucntion
     * @param number
     * @return valor gama
     */
    public static int gamaFunction(int number) {
        if (number > 0) {
            number--;
        }
        return (int) factorial(number);
    }

    /**
     * M�todo para calcular la funci�n gamma del n�mero doble
     * @method gamaFucntion
     * @param number
     * @return valor gama
     */
    public static double gamaFucntion(double number) {
        if (number > 0) {
            number--;
        }
        return factorial(number);
    }

    /**
     * M�todo para calcular la funci�n factorial del n�mero
     * @method factorial
     * @param number
     * @return valor factorial
     */
    public static double factorial(double number) {
        if (number == ZERO) {
            return 1.0;
        } else if (number == MIDDLE) {
            return number * Math.sqrt(Math.PI);
        } else {
            return number * factorial(number - 1);
        }
    }

}