package decoratorPattern;

public class BasicPhone implements Phone {
    @Override
    public void create() {
        System.out.println("Soy un teléfono básico.");
        sms();
        gsm();
    }

    private void sms() {
        System.out.println("  BasicPhone -> También tengo SMS");
    }

    private void gsm() {
        System.out.println("  BasicPhone -> También tengo GSM");
    }
}
