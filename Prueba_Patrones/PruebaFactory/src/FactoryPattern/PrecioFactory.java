package FactoryPattern;

public class PrecioFactory implements Precio {
    private final Precio precio;

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("españa")) {
            precio = new PrecioEUR();
            System.out.println("Precio en España");
        } else if (pais.equalsIgnoreCase("UK")) {
            precio = new PrecioGBP();
            System.out.println("Precio en Gran Bretaña");
        } else {
            precio = new PrecioUSD();
            System.out.println("Precio en USA");
        }
    }

    public float getPrecio() {
        return precio.getPrecio();
    }
}
