package Ui;

import Variables.Global;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inicio extends JFrame{
    private JPanel mainPanel, body;
    private JButton btnEditar, btnAdd;
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

        //Listener para el boton de añadir reloj
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Creo la ventana para añadir reloj
                //Envío como parámetro la pantalla actual para manipularla en la ventana de añadir reloj
                new VentanaAddReloj(pantallaInicio);
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
