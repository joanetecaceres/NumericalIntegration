import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import com.heroku.sdk.jdbc.DatabaseUrl;
import control.Controller;
import model.TDistribution;
import static spark.Spark.get;


/**
 * Esta clase administra la vista de la pagina y muestra los resultados de los casos de prueba
 * @class  Main
 * @author Carolina Caceres
 */
public class Main {

    /**
     * @method main 
     */
    public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/NumericalIntegration", (req, res) -> {
          
        TDistribution TDistribution1 = new TDistribution();
        TDistribution1.setNumSeg(10);
        TDistribution1.setDof(9);
        TDistribution1.setxValue(1.1);
        TDistribution1.setWidthSegment(TDistribution1.getxValue() / TDistribution1.getNumSeg());
        TDistribution TestCase1 = Controller.IntegrationFunction(TDistribution1);

        TDistribution TDistribution2 = new TDistribution();
        TDistribution2.setNumSeg(10);
        TDistribution2.setDof(10);
        TDistribution2.setxValue(1.1812);
        TDistribution2.setWidthSegment(TDistribution2.getxValue() / TDistribution2.getNumSeg());
        TDistribution TestCase2 = Controller.IntegrationFunction(TDistribution2);

        TDistribution TDistribution3 = new TDistribution();
        TDistribution3.setNumSeg(10);
        TDistribution3.setDof(30);
        TDistribution3.setxValue(2.750);
        TDistribution3.setWidthSegment(TDistribution3.getxValue() / TDistribution3.getNumSeg());
        TDistribution TestCase3 = Controller.IntegrationFunction(TDistribution3);

           String resultHtml="<!DOCTYPE html><br>" +
            "<html><br>" +
            "<head><br>" +
            "<style><br>" +
            "table, th, td {<br>" +
            "    border: 1px solid gray;<br>" +
            "    border-collapse: collapse;<br>" +
            "}<br>" +
            "th, td {<br>" +
            "    padding: 5px;<br>" +
            "}<br>" +
            "</style><br>" +
            "</head><br>" +
            "<body><br>" +
            "<br>" +
            "<table style=\"width:100%\"><br>" +
            "  <tr><br>" +
            "    <th>Valor p Esperado</th><br>" +
            "    <th>Valor p Actual</th><br>" +
            "   <br>" +
            "  </tr><br>" +
            "  <tr><br>" +
            "    <td>0.35006</td><br>" +
            "    <td>"+TestCase1.getP()+"</td><br>" +
            "    <br>" +
            "  </tr><br>" +
            "  <tr><br>" +
            "    <td>0.36757</td><br>" +
            "    <td>"+TestCase2.getP()+"</td><br>" +
            "    <br>" +
            "  </tr><br>" +
            "  <tr><br>" +
            "    <td>0.49500</td><br>" +
            "    <td>"+TestCase3.getP()+"</td><br>" +
            "    <br>" +
            "  </tr><br>" +
            "</table><br>" +
            "<br>" +
            "</body><br>" +
            "</html>";
            
           return resultHtml;
            
        });
    }
}