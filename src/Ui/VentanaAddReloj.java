package Ui;

import Variables.Global;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAddReloj extends JFrame{
    private JComboBox selectorZona;
    private JButton btnAdd;
    private JPanel mainPanel;

    public VentanaAddReloj(Inicio pantallaAnterior) {
        setSize(Global.anchoVentanaSec, Global.altoVentanaSec);
        setVisible(true);
        setLocationRelativeTo(null);
        add(mainPanel);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        //Añadir reloj
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearNuevoReloj(pantallaAnterior);
            }
        });

    }

    //Metodo para actualizar el array y crear nuevo relojes
    private void crearNuevoReloj(Inicio pantallaAnterior) {
        //Ocultamos la pantalla de inicio para actualizarla
        pantallaAnterior.setVisible(false);
        //Ocultamos la actual
        setVisible(false);
        String zonaSelec = selectorZona.getSelectedItem().toString();
        Global.datosRelojes.add(zonaSelec);

        new Inicio(Global.datosRelojes);


    }

}
