package model;

/**
 * Esta clase contiene a la distribucion t de datos y resultados obtenidos mediante la integracion numerica
 * Clase TDistribution
 * @author Carolina Caceres
 */
public class TDistribution {
    
    //segmento de valor x
    private double xValue;
    //numero inicial de segmentos
    private int numSeg;
    //grado de libertad
    private int dof;
    //resultado de la integracion numerica
    private double p;
    //ancho del segmento
    private double widthSegment;
    //valor de error aceptable
    private double errorValue;

    /**
     * Metodo getxValue
     * Retorna xValue
     */
    public double getxValue() {
        return xValue;
    }

    /**
     * Metodo setxValue
     * Parametro xValue
     */
    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    /**
     * Metodo getNumSeg
     * Retorna numSeg
     */
    public int getNumSeg() {
        return numSeg;
    }

    /**
     * Metodo setNumSeg 
     * Parametro numSeg
     */
    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    /**
     * Metodo getDof
     * Retorna dof
     */
    public int getDof() {
        return dof;
    }

    /**
     * Metodo setDof
     * Parametro dof
     */
    public void setDof(int dof) {
        this.dof = dof;
    }

    /**
     * Metodo getP
     * Retorna p
     */
    public double getP() {
        return p;
    }

    /**
     * Metodo setP
     * Parametro p
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * Metodo getWidthSegment
     * Retorna widthSegment
     */
    public double getWidthSegment() {
        return widthSegment;
    }

    /**
     *Metodo setWidthSegment
     * Parametro widthSegment
     */
    public void setWidthSegment(double widthSegment) {
        this.widthSegment = widthSegment;
    }

    /**
     * Metodo getErrorValue
     * Retorna errorValue
     */
    public double getErrorValue() {
        return errorValue;
    }

    /**
     * Metodo setErrorValue
     * Parametro errorValue
     */
    public void setErrorValue(double errorValue) {
        this.errorValue = errorValue;
    }           
    
}
