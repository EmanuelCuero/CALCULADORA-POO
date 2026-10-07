package calculadora.controlador;

import calculadora.modelo.Division;
import calculadora.modelo.LogaritmoNatural;
import calculadora.modelo.Multiplicacion;
import calculadora.modelo.OperacionMatematica;
import calculadora.modelo.RaizCuadrada;
import calculadora.modelo.RaizCubica;
import calculadora.modelo.Resta;
import calculadora.modelo.Suma;
import calculadora.vista.VentanaCalculadora;
import java.util.Locale;

/** Coordina la lectura de la vista, el modelo matemático y la respuesta mostrada. */
public final class ControladorCalculadora {
    private final VentanaCalculadora vista;

    public ControladorCalculadora(VentanaCalculadora vista) {
        this.vista = vista;
        vista.alPulsarCalcular(this::calcular);
    }

    private void calcular() {
        try {
            String operacion = vista.obtenerOperacionSeleccionada();
            double a = convertirNumero(vista.obtenerPrimerNumero(), "primer número");
            OperacionMatematica calculo;
            switch (operacion) {
                case "Suma" -> calculo = new Suma(a, convertirNumero(vista.obtenerSegundoNumero(), "segundo número"));
                case "Resta" -> calculo = new Resta(a, convertirNumero(vista.obtenerSegundoNumero(), "segundo número"));
                case "Multiplicación" -> calculo = new Multiplicacion(a, convertirNumero(vista.obtenerSegundoNumero(), "segundo número"));
                case "División" -> calculo = new Division(a, convertirNumero(vista.obtenerSegundoNumero(), "segundo número"));
                case "Raíz cuadrada" -> calculo = new RaizCuadrada(a);
                case "Raíz cúbica" -> calculo = new RaizCubica(a);
                case "Logaritmo natural" -> calculo = new LogaritmoNatural(a);
                default -> throw new IllegalArgumentException("Selecciona una operación válida.");
            }
            double resultado = calculo.calcular();
            if (!Double.isFinite(resultado)) throw new ArithmeticException("El resultado está fuera del rango numérico.");
            vista.mostrarResultado(String.format(Locale.forLanguageTag("es-CO"), "%s = %.10g", calculo.obtenerNombreOperacion(), resultado));
        } catch (IllegalArgumentException | ArithmeticException excepcion) {
            vista.mostrarError(excepcion.getMessage());
        }
    }

    private double convertirNumero(String texto, String nombreCampo) {
        String normalizado = texto == null ? "" : texto.trim().replace(',', '.');
        if (normalizado.isEmpty()) throw new IllegalArgumentException("Ingresa el " + nombreCampo + ".");
        try {
            double numero = Double.parseDouble(normalizado);
            if (!Double.isFinite(numero)) throw new NumberFormatException();
            return numero;
        } catch (NumberFormatException excepcion) {
            throw new IllegalArgumentException("El " + nombreCampo + " debe ser un número válido.");
        }
    }
}
