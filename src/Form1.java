import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JButton enviarButton;
    private JSlider slider1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JButton saludo;
    public JPanel mipanel;
    private JButton borrar;
    private JTextArea texto;
    private JButton enviar;
    private JTextField ingresar;
    public JPanel panel1;
    private JLabel label1;

    public Form1() {
        saludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Hola a todos");
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Borrado");
            }
        });


        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresar.setText(ingresar.getText());
            }
        });
    }
}

