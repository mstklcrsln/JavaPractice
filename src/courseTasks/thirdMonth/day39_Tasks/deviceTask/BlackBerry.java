package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class BlackBerry extends  Phone {

    public BlackBerry( String model, double price, boolean hasPowerButton, boolean hasBattery) {
        super("BlackBerry", model, price, hasPowerButton, hasBattery);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public boolean isHasBattery() {
        return super.isHasBattery();
    }

    @Override
    public void call(long phoneNum) {
        super.call(phoneNum);
    }

    @Override
    public void text(long phoneNum) {
        super.text(phoneNum);
    }
}
