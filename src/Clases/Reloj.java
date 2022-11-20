package Clases;

import javax.swing.*;
import java.util.Calendar;
import java.util.TimeZone;

public class Reloj extends Thread{
    private String zona;
    public Reloj(String zona) {
        this.zona = zona;
        this.start();
    }

    public void run(){
        while(true){
            try {
                Calendar calendario = Calendar.getInstance();
                calendario.setTimeZone(TimeZone.getTimeZone(zona));

                String horaActual = calendario.get(Calendar.HOUR_OF_DAY) + ":" +
                        calendario.get(Calendar.MINUTE) + ":" +
                        calendario.get(Calendar.SECOND);;

                System.out.println(horaActual);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo");
            }
        }
    }
}
