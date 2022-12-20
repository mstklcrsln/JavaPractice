package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean hasPowerButton, boolean hasBattery) {
        super(brand, model, price, hasPowerButton, hasBattery);
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

    public void call(long phoneNum) {
        System.out.println(phoneNum+ " is calling "+ getBrand());
    }

    public void text (long phoneNum){
        System.out.println(phoneNum+ " is sending message to "+ getBrand());
    }



}
/*
2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

						while creating child class:
    1- Add the features that can not be inherited from parent class.
    So constructor will get these
    2- add getter and setter, because they will not be inherited from parent class
    3- add requirements to the setter to be sure that user can not put negative numbers
    4- After finishing these phases apply the extends keyword
    5- Add constructor with all these fields (length, width)
    6- Work on other methods about rectangle
    7- Override methods from parent class, by right click/generate/override
    8- Generate the toString method in the rectangle class for include length and width
    9- Add knowledge about area and perimeter into the toString method
 */