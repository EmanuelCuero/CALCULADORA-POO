package calculadora.modelo;

/** Datos compartidos por operaciones que reciben dos operandos. */
public abstract class OperacionMatematicaBinaria implements OperacionMatematica {
    protected final double primerNumero;
    protected final double segundoNumero;

    protected OperacionMatematicaBinaria(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }
}
