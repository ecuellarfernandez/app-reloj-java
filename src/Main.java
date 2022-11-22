import Ui.Inicio;
import Variables.Global;
import com.formdev.flatlaf.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        new Inicio(Global.datosRelojes);
    }
}