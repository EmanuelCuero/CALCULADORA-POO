package calculadora;

import calculadora.controlador.ControladorCalculadora;
import calculadora.vista.VentanaCalculadora;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/** Punto de entrada de la aplicación. */
public final class Main {
    private Main() { }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
            catch (Exception ignorada) { /* Se conserva el estilo Swing predeterminado. */ }
            VentanaCalculadora ventana = new VentanaCalculadora();
            new ControladorCalculadora(ventana);
            ventana.setVisible(true);
        });
    }
}
