package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class PersonalComputer extends  Computer{

    public PersonalComputer(String model, double price, boolean hasPowerButton, boolean hasBattery) {
        super("Personal computer", model, price, hasPowerButton, hasBattery);
    }

    @Override
    public boolean isHasBattery() {
        return super.isHasBattery();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
