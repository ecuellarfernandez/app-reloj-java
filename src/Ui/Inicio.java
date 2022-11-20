package Ui;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame{
    private JPanel mainPanel;
    private JPanel body;
    private JLabel lblTitulo;
    private JButton button1;

    public Inicio(){
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null);
        add(mainPanel);

        //LAYOUT
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));

        JPanel reloj = new JPanel();
        JPanel reloj2 = new JPanel();
        JPanel reloj3 = new JPanel();
        reloj.add(new JLabel("Hola"));
        reloj.add(new JLabel("Hola"));
        reloj.add(new JLabel("Hola"));
        reloj2.add(new JLabel("Hola"));
        reloj2.add(new JLabel("Hola"));
        reloj2.add(new JLabel("Hola"));
        reloj3.add(new JLabel("Hola"));
        reloj3.add(new JLabel("Hola"));
        reloj3.add(new JLabel("Hola"));

        body.add(reloj);
        body.add(reloj2);
        body.add(reloj3);

    }

}
