package calculadora.modelo;

public final class Suma extends OperacionMatematicaBinaria {
    public Suma(double a, double b) { super(a, b); }
    @Override public double calcular() { return primerNumero + segundoNumero; }
    @Override public String obtenerNombreOperacion() { return "Suma"; }
}
