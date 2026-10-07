package calculadora.modelo;

/** Contrato común para las operaciones disponibles en la calculadora. */
public interface OperacionMatematica {
    double calcular() throws ArithmeticException;
    String obtenerNombreOperacion();
}
