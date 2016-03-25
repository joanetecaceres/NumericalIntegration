package model;

/**
 * Esta clase contiene a la distribucion t de datos y resultados obtenidos mediante la integracion numerica
 * @class TDistribution
 * @author Carolina Caceres
 */
public class TDistribution {
    
    //segmento de valor x
    private double xValue;
    //inúmero inicial de segmentos
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
     * @method getxValue
     * @return xValue
     */
    public double getxValue() {
        return xValue;
    }

    /**
     * @method setxValue
     * @param xValue
     */
    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    /**
     * @method getNumSeg
     * @return numSeg
     */
    public int getNumSeg() {
        return numSeg;
    }

    /**
     * @method setNumSeg 
     * @param numSeg
     */
    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    /**
     * @method getDof
     * @return dof
     */
    public int getDof() {
        return dof;
    }

    /**
     * @method setDof
     * @param dof
     */
    public void setDof(int dof) {
        this.dof = dof;
    }

    /**
     * @method getP
     * @return p
     */
    public double getP() {
        return p;
    }

    /**
     * @method setP
     * @param p
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * @method getWidthSegment
     * @return widthSegment
     */
    public double getWidthSegment() {
        return widthSegment;
    }

    /**
     *@method setWidthSegment
     * @param widthSegment
     */
    public void setWidthSegment(double widthSegment) {
        this.widthSegment = widthSegment;
    }

    /**
     * @mehtod getErrorValue
     * @return errorValue
     */
    public double getErrorValue() {
        return errorValue;
    }

    /**
     * @mehtod setErrorValue
     * @param errorValue
     */
    public void setErrorValue(double errorValue) {
        this.errorValue = errorValue;
    }           
    
}
