import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
        JOptionPane.showInputDialog("Ingrese su nombre");

        String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero");
        String tercerNumero = JOptionPane.showInputDialog("Ingrese el tercer numero");
        String cuartoNumero = JOptionPane.showInputDialog("Ingrese el cuarto numero");

        //Convierte las entradas String en un dialodo de mensaje Joption
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int numero3 = Integer.parseInt(tercerNumero);
        int numero4 = Integer.parseInt(cuartoNumero);
        int suma = numero1 + numero2+ numero3+ numero4;
        int resta = numero1 - numero2 + numero3+ numero4;
        int multiplicacion = numero1 * numero2 * numero3 * numero4;
        int division = suma / 4;

        //Muestra los resultados en un dialogo de mensaje de JOptionPane
        JOptionPane.showMessageDialog(null, "El suma es: " + suma, "Suma de dos entreros", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La resta es:" + resta, "Resta de dos entreros", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+ multiplicacion,"Multiplicacion de dos entreros", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La division es: "+ division,"Division de dos entreros", JOptionPane.PLAIN_MESSAGE);

    }
}