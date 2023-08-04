package decoratorPattern;

public class PhoneDecorator implements Phone {
    private final Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void create() {
        phone.create();
    }
}
