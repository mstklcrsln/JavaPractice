package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class Computer extends  Device {

    public Computer(String brand, String model, double price, boolean hasPowerButton, boolean hasBattery) {
        super(brand, model, price, hasPowerButton, hasBattery);
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
/*
3. Create a subclass of Device named Computer:

				Add the extra methods if needed
 */