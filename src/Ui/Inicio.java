package Ui;

import Variables.Global;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Inicio extends JFrame{
    private JPanel mainPanel, body;
    private JButton btnEditar;
    private JButton btnDark, btnLight;
    private ArrayList<String> datosRelojes;

    public Inicio(ArrayList<String> datosRelojes){
        Inicio pantallaInicio = this;
        this.datosRelojes = datosRelojes;
        setVisible(true);
        setSize(Global.anchoVentana, Global.altoVentana);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mainPanel);

        //LAYOUT
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));

        imprimirRelojes();
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaEditarRelojes(pantallaInicio);
                setVisible(false);
            }
        });

        btnLight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                    new Inicio(datosRelojes);
                    setVisible(false);
                } catch (UnsupportedLookAndFeelException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        btnDark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                    new Inicio(datosRelojes);
                    setVisible(false);
                } catch (UnsupportedLookAndFeelException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    //Imprimir relojes obteniendo los datos del array recibido por parametro
    private void imprimirRelojes() {
        for (int i = 0; i < datosRelojes.size(); i++) {
            //Añadimos al body del mainPanel los paneles de los relojes
            body.add(new PanelReloj(datosRelojes.get(i)));
        }

    }

}
