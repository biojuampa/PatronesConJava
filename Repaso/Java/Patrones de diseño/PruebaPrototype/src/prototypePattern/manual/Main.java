package prototypePattern.manual;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.setMarca("Ford");
        coche1.setModelo("Focus III");
        coche1.setPotencia(170);
        coche1.setPuertas(5);

        System.out.println("Coche 1 -> " + coche1);
        System.out.println("-------");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Potencia: " + coche1.getPotencia() + " c.v.");
        System.out.println("Puertas: " + coche1.getPuertas());
        System.out.println();

        Coche coche2 = coche1.clonar();

        coche2.setModelo("Focus II");
        coche2.setPotencia(135);

        System.out.println("Coche 2 -> " + coche2);
        System.out.println("-------");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Potencia: " + coche2.getPotencia() + " c.v.");
        System.out.println("Puertas: " + coche2.getPuertas());
        System.out.println();
    }
}
