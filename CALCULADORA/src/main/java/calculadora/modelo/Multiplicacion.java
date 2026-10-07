package calculadora.modelo;

public final class Multiplicacion extends OperacionMatematicaBinaria {
    public Multiplicacion(double a, double b) { super(a, b); }
    @Override public double calcular() { return primerNumero * segundoNumero; }
    @Override public String obtenerNombreOperacion() { return "Multiplicación"; }
}
