package prototypePattern.cloneable;

public class CocheCloneable implements Cloneable {
    private String marca;
    private String modelo;
    private int potencia;
    private int puertas;

    public CocheCloneable clonar() throws CloneNotSupportedException {
        return (CocheCloneable)this.clone();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
