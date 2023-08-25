public class Vehiculo {
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior ) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    //Usamos getters para que comparendo pueda acceder a las variables
    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }
}
