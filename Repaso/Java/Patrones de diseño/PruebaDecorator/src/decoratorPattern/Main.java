package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.create();

        System.out.println();

        NextGenPhone nextGenPhone =
                new NextGenPhone(
                        new SmartPhone(
                                new BasicPhone()
                        )
                );
        nextGenPhone.create();
    }
}
