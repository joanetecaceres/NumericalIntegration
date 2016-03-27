package model;

/**
 * Clase para gestionar las operaciones matematicas utilizadas en la integracion numerica
 * Clase Operations
 * @author Carolina Caceres
 */
public class Operations {

    public final static double ZERO = 0;
    public final static double MIDDLE = 0.5;
    public final static double ERROR = 0.00001;

    /**
     * Metodo para calcular la integracion numerica de la distribucion t 
     * Metodo NumericalIntegration
     * Parametro t T Distribution 
     * Retorna valor p integracion numerica
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
     * Metodo para calcular f(x) utilizando el proceso de integracion numerica
     * Metodo functionX
     * Parametro x
     * Parametro dof
     * Retorna valor f(x)
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
     * Metodo para calcular la funcion gamma del numero entero
     * Metodo gamaFucntion
     * Parametro number
     * Retorna valor gama
     */
    public static int gamaFunction(int number) {
        if (number > 0) {
            number--;
        }
        return (int) factorial(number);
    }

    /**
     * Metodo para calcular la funcion gamma del numero doble
     * Metodo gamaFucntion
     * Parametro number
     * Retorna valor gama
     */
    public static double gamaFucntion(double number) {
        if (number > 0) {
            number--;
        }
        return factorial(number);
    }

    /**
     * Metodo para calcular la funcion factorial del numero
     * Metodo factorial
     * Parametro number
     * Retorna valor factorial
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
