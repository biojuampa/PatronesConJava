package singletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setValor(15);

        System.out.println(singleton);
        System.out.println(singleton.getValor());

        System.out.println(singleton2);
        System.out.println(singleton2.getValor());
    }
}
