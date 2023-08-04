package decoratorPattern;

public class NextGenPhone extends PhoneDecorator {
    public NextGenPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("  NextGenPhone -> También tengo 5G");
        System.out.println("  NextGenPhone -> También tengo VoLTE");
    }
}
