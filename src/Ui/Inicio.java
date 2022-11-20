package Ui;

import javax.swing.*;
import java.util.ArrayList;

public class Inicio extends JFrame{
    private JPanel mainPanel, body;
    private JLabel lblTitulo;
    private JButton btnEditar, btnAdd;
    private String[] datosRelojes;

    public Inicio(String[] datosRelojes){
        this.datosRelojes = datosRelojes;
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null);
        add(mainPanel);

        //LAYOUT
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));

        imprimirRelojes();
    }

    private void imprimirRelojes() {
        for (int i = 0; i < datosRelojes.length; i++) {
            body.add(new PanelReloj(datosRelojes[i]));
        }

    }

}
