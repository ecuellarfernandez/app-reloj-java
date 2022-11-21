package Ui;

import Variables.Global;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEditarRelojes extends JFrame{
    private JComboBox relojes;
    private JButton btnEliminar, btnAdd;
    private JPanel mainPanel;
    private JComboBox selectorZona;

    public VentanaEditarRelojes(Inicio pantallaAnterior) {
        setSize(Global.anchoVentanaSec, Global.altoVentanaSec);
        setVisible(true);
        setLocationRelativeTo(null);
        add(mainPanel);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        cargarRelojes();

        //Eliminar reloj
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarReloj(pantallaAnterior);
            }
        });

        //Añadir nuevo reloj
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearNuevoReloj(pantallaAnterior);
            }
        });

    }

    //METODOS DE AYUDA
    private void crearNuevoReloj(Inicio pantallaAnterior) {
        //Ocultamos la pantalla de inicio para actualizarla
        pantallaAnterior.setVisible(false);
        //Ocultamos la actual
        setVisible(false);
        String zonaSelec = selectorZona.getSelectedItem().toString();
        Global.datosRelojes.add(zonaSelec);

        new Inicio(Global.datosRelojes);
    }

    private void cargarRelojes() {
        for (String r:Global.datosRelojes) {
            relojes.addItem(r);
        }
    }

    private void eliminarReloj(Inicio pantallaAnterior) {
        if(Global.datosRelojes.size()!=0){
            //Ocultamos la pantalla de inicio para actualizarla
            pantallaAnterior.setVisible(false);
            //Ocultamos la actual
            setVisible(false);
            String zonaSelec = relojes.getSelectedItem().toString();
            Global.datosRelojes.remove(zonaSelec);

            new Inicio(Global.datosRelojes);
        }

    }
}