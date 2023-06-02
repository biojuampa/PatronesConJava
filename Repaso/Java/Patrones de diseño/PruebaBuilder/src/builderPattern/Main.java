package builderPattern;

public class Main {
    public static void main(String[] args) {
        Coche coche = new CocheBuilder()
                .setMarca("Ford")
                .setModelo("Focus III")
                .setPotencia(170)
                .build()
                ;

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Potencia: " + coche.getPotencia());
    }
}
