import control.Controller;
import model.Operations;
import model.TDistribution;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba
 * @class  ControllerTest
 * @author Carolina Caceres
 */
public class ControllerTest {

    public ControllerTest() {
    }

   
    @Test
    public void testCalculateIntegrationFunction() {
        TDistribution TDistribution1 = new TDistribution();
        TDistribution1.setNumSeg(10);
        TDistribution1.setDof(9);
        TDistribution1.setxValue(1.1);
        TDistribution1.setErrorValue(Operations.ERROR);
        TDistribution1.setWidthSegment(TDistribution1.getxValue() / TDistribution1.getNumSeg());
        TDistribution TestCase1 = Controller.IntegrationFunction(TDistribution1);

        assertEquals("error en la distribucion t1 ", 0.35006, (double)Math.round(TestCase1.getP() * 100000) / 100000, TDistribution1.getErrorValue());

        TDistribution TDistribution2 = new TDistribution();
        TDistribution2.setNumSeg(10);
        TDistribution2.setDof(10);
        TDistribution2.setxValue(1.1812);
        TDistribution2.setErrorValue(Operations.ERROR);
        TDistribution2.setWidthSegment(TDistribution2.getxValue() / TDistribution2.getNumSeg());
        TDistribution TestCase2 = Controller.IntegrationFunction(TDistribution2);

        assertEquals("error en la distribucion t2 ", 0.36757, (double)Math.round(TestCase2.getP() * 100000) / 100000, TDistribution2.getErrorValue());

        TDistribution TDistribution3 = new TDistribution();
        TDistribution3.setNumSeg(10);
        TDistribution3.setDof(30);
        TDistribution3.setxValue(2.750 );
        TDistribution3.setErrorValue(Operations.ERROR);
        TDistribution3.setWidthSegment(TDistribution3.getxValue() / TDistribution3.getNumSeg());
        TDistribution TestCase3 = Controller.IntegrationFunction(TDistribution3);

        assertEquals("error en la distribucion t3 ", 0.49500, (double)Math.round(TestCase3.getP() * 100000) / 100000, TDistribution3.getErrorValue());      
    }

}