package calculadora.modelo;

public final class LogaritmoNatural extends OperacionMatematicaUnaria {
    public LogaritmoNatural(double numero) { super(numero); }
    @Override public double calcular() {
        if (numero <= 0) throw new ArithmeticException("El logaritmo natural requiere un número mayor que cero.");
        return Math.log(numero);
    }
    @Override public String obtenerNombreOperacion() { return "Logaritmo natural"; }
}
