package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Precio precioEUR = new PrecioFactory("España");
        System.out.println(precioEUR.getPrecio());
        Precio precioUK = new PrecioFactory("uk");
        System.out.println(precioUK.getPrecio());
        Precio precioUSD = new PrecioFactory("usa");
        System.out.println(precioUSD.getPrecio());
    }
}
