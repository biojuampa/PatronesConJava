package decoratorPattern;

public class PhoneDecorator implements Phone {
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void create() {
        phone.create();
    }
}
