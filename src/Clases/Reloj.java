package Clases;

import javax.swing.*;
import java.util.Calendar;
import java.util.TimeZone;

public class Reloj extends Thread{
    private String zona;
    private JLabel contenedorReloj;
    public Reloj(JLabel contenedorReloj,String zona) {
        this.zona = zona;
        this.contenedorReloj = contenedorReloj;
        this.start();
    }

    public void run(){
        while(true){
            try {
                Calendar calendario = Calendar.getInstance();
                calendario.setTimeZone(TimeZone.getTimeZone(zona));
                int seg = calendario.get(Calendar.SECOND);
                int min = calendario.get(Calendar.MINUTE);
                int horas = calendario.get(Calendar.HOUR_OF_DAY);
                String horaActual = (horas<=9?"0":"") + horas + ":" +
                        (min<=9?"0":"") + min + ":" + (seg<=9?"0":"") + seg;
                contenedorReloj.setText(horaActual);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo");
            }
        }
    }
}
