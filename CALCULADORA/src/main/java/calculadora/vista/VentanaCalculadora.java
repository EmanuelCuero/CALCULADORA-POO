package calculadora.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Ventana Swing; solo presenta controles y comunica acciones al controlador. */
public final class VentanaCalculadora extends JFrame {
    private final JTextField campoPrimerNumero = new JTextField();
    private final JTextField campoSegundoNumero = new JTextField();
    private final JComboBox<String> selectorOperacion = new JComboBox<>(new String[]{
        "Suma", "Resta", "Multiplicación", "División", "Raíz cuadrada", "Raíz cúbica", "Logaritmo natural"
    });
    private final JButton botonCalcular = new JButton("Calcular");
    private final JLabel etiquetaSegundoNumero = new JLabel("Segundo número:");
    private final JLabel etiquetaResultado = new JLabel("Resultado: ");

    public VentanaCalculadora() {
        super("Calculadora académica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 250);
        setLocationRelativeTo(null);
        JPanel formulario = new JPanel(new GridLayout(4, 2, 8, 8));
        formulario.setBorder(BorderFactory.createEmptyBorder(18, 18, 12, 18));
        formulario.add(new JLabel("Operación:")); formulario.add(selectorOperacion);
        formulario.add(new JLabel("Primer número:")); formulario.add(campoPrimerNumero);
        formulario.add(etiquetaSegundoNumero); formulario.add(campoSegundoNumero);
        formulario.add(new JLabel("")); formulario.add(botonCalcular);
        add(formulario, BorderLayout.CENTER);
        etiquetaResultado.setBorder(BorderFactory.createEmptyBorder(0, 18, 16, 18));
        add(etiquetaResultado, BorderLayout.SOUTH);
        selectorOperacion.addActionListener(evento -> actualizarCampoSegundoNumero());
        actualizarCampoSegundoNumero();
    }

    public String obtenerOperacionSeleccionada() { return (String) selectorOperacion.getSelectedItem(); }
    public String obtenerPrimerNumero() { return campoPrimerNumero.getText(); }
    public String obtenerSegundoNumero() { return campoSegundoNumero.getText(); }
    public void alPulsarCalcular(Runnable accion) { botonCalcular.addActionListener(evento -> accion.run()); }
    public void mostrarResultado(String resultado) { etiquetaResultado.setText("Resultado: " + resultado); }
    public void mostrarError(String mensaje) { etiquetaResultado.setText("Error: " + mensaje); }

    private void actualizarCampoSegundoNumero() {
        boolean esBinaria = selectorOperacion.getSelectedIndex() < 4;
        campoSegundoNumero.setEnabled(esBinaria);
        etiquetaSegundoNumero.setEnabled(esBinaria);
    }
}
