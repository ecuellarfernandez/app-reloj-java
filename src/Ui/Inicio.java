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

        body.add(new PanelReloj("Europe/Madrid"));
        body.add(new PanelReloj("America/La_Paz"));
    }

}
