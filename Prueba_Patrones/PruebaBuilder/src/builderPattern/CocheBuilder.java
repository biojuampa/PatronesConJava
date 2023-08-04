package builderPattern;

public class CocheBuilder {
    private final Coche coche = new Coche();

    public CocheBuilder setMarca(String marca) {
        coche.setMarca(marca);
        return this;
    }

    public CocheBuilder setModelo(String modelo) {
        coche.setModelo(modelo);
        return this;
    }

    public CocheBuilder setPotencia(int potencia) {
        coche.setPotencia(potencia);
        return this;
    }

    public Coche build() {
        return coche;
    }

}
