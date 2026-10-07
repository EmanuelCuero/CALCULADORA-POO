package calculadora.modelo;

public final class RaizCuadrada extends OperacionMatematicaUnaria {
    public RaizCuadrada(double numero) { super(numero); }
    @Override public double calcular() {
        if (numero < 0) throw new ArithmeticException("La raíz cuadrada requiere un número no negativo.");
        return Math.sqrt(numero);
    }
    @Override public String obtenerNombreOperacion() { return "Raíz cuadrada"; }
}
