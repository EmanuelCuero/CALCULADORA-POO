package calculadora.modelo;

public final class RaizCubica extends OperacionMatematicaUnaria {
    public RaizCubica(double numero) { super(numero); }
    @Override public double calcular() { return Math.cbrt(numero); }
    @Override public String obtenerNombreOperacion() { return "Raíz cúbica"; }
}
