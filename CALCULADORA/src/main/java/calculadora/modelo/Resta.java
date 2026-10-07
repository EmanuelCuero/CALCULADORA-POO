package calculadora.modelo;

public final class Resta extends OperacionMatematicaBinaria {
    public Resta(double a, double b) { super(a, b); }
    @Override public double calcular() { return primerNumero - segundoNumero; }
    @Override public String obtenerNombreOperacion() { return "Resta"; }
}
