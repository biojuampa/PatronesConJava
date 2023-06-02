package singletonPattern;

public class Singleton {
    private static Singleton singleton;
    private int valor = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
