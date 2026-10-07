package calculadora.modelo;

public final class Division extends OperacionMatematicaBinaria {
    public Division(double a, double b) { super(a, b); }
    @Override public double calcular() {
        if (segundoNumero == 0) throw new ArithmeticException("No se puede dividir entre cero.");
        return primerNumero / segundoNumero;
    }
    @Override public String obtenerNombreOperacion() { return "División"; }
}
