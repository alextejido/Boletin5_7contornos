package boletin5_7;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class metodos {
    
    private String Cadrado,Triangulo,Circulo;
    public metodos(){
    }   
    public void calAreas(){
        String opcion=JOptionPane.showInputDialog("Opcion a elegir:\ncadrado\ntriangulo\ncirculo");
        float area;
        switch(opcion){
            case "cadrado":
                float lado=Float.parseFloat(JOptionPane.showInputDialog("Lado "));
                area=lado*lado;
                JOptionPane.showMessageDialog(null,"Area ="+area);
                break;
            case "triangulo":
                float base=Float.parseFloat(JOptionPane.showInputDialog("Base "));
                float altura=Float.parseFloat(JOptionPane.showInputDialog("Altura "));
                area=base*altura/2;
                JOptionPane.showMessageDialog(null,"Area ="+ area);
                break;
            case "circulo":
                float radio=Float.parseFloat(JOptionPane.showInputDialog("Radio "));
                area=(float) (PI*Math.pow(radio,2));
                JOptionPane.showMessageDialog(null,"Area ="+area);
                break;
            default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
                //primera modificación
    }
        }
    
}
