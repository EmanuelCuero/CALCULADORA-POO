package calculadora.modelo;

/** Datos compartidos por operaciones que reciben un operando. */
public abstract class OperacionMatematicaUnaria implements OperacionMatematica {
    protected final double numero;

    protected OperacionMatematicaUnaria(double numero) {
        this.numero = numero;
    }
}
