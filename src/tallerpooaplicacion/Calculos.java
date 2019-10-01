
package tallerpooaplicacion;

import javax.swing.JOptionPane;


class Calculos {
    
    public double areaEsfera(){
        double pi=Math.PI;
        double radio;
        double area;
        radio=Float.parseFloat(JOptionPane.showInputDialog("ingrese el radio de la esfera para hallar el area"));
        area=pi*(Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null, "el area de la esfera es: "+area);
        return (area);
    }
    public double volumenEsfera(){
        double pi=Math.PI;
        double radio;
        double volumen;
        radio=Double.parseDouble(JOptionPane.showInputDialog("digite el radio de la esfera para hallar el volumen"));
        volumen=(4*pi*(Math.pow(radio, 3))/3);
        JOptionPane.showMessageDialog(null, "el volumen de la esfera es: "+volumen);
        return(volumen);
    }
    
}

