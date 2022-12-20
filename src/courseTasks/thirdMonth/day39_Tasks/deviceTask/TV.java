package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class TV extends  Device {

    public TV(String brand, String model, double price, boolean hasPowerButton, boolean hasBattery) {
        super(brand, model, price, hasPowerButton, hasBattery);
    }

    public void channelUp(){
        System.out.println(getModel()+ " "+ getBrand() + " is going up channel");
    }
    public void channelDown(){
        System.out.println(getModel()+ " "+ getBrand() + " is going down channel");
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
4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */