package Ui;

import Clases.Reloj;

import javax.swing.*;
import java.awt.*;

public class PanelReloj extends JPanel {
    private String zona;
    private JLabel lblTitulo, lblReloj;

    PanelReloj(String zona){
        this.zona = zona;
        setLayout(new FlowLayout(FlowLayout.LEFT));

        lblTitulo = new JLabel(zona);
        lblReloj = new JLabel(zona);

        new Reloj(lblReloj, zona);

        add(lblTitulo);
        add(lblReloj);
    }
}
