import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"area es 9");

    //Añadimos datos
        float lado=3, area;

        //Calculamos area
        area=lado*lado;
        //otra forma
        //area=(float)Math.pow(lado,2);

        //Mostramos
        System.out.println("area="+area);

        //Sin declarar area seria ("area="+lado*lado)
    }
}