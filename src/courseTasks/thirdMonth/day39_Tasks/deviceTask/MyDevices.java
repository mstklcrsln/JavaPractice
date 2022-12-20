package courseTasks.thirdMonth.day39_Tasks.deviceTask;

public class MyDevices {
    public static void main(String[] args) {


        BlackBerry blackBerry = new BlackBerry("a102", 1000,true,true);
        System.out.println("blackBerry = " + blackBerry); //blackBerry = Device{brand='BlackBerry', model='a102', price=1000.0, hasPowerButton=true, hasBattery=true}
        blackBerry.turnOff(); //BlackBerry a102 is turning off
        System.out.println(blackBerry.getPrice()); //1000.0
        System.out.println(blackBerry.isHasPowerButton()); //true
        blackBerry.turnOn(); //BlackBerry a102 is turning on

        System.out.println("--------------");

        Computer computer = new Computer("Alai", "m102", 2000, true,false);
        System.out.println(computer); //Device{brand='Alai', model='m102', price=2000.0, hasPowerButton=true, hasBattery=false}
        System.out.println(computer.getBrand()); //Alai
        System.out.println(computer.isHasPowerButton()); //true

        System.out.println("--------------");

        Nokia nokia = new Nokia("3110", 500, true, true);
        System.out.println(nokia); //Device{brand='Nokia', model='3110', price=500.0, hasPowerButton=true, hasBattery=true}
        nokia.turnOn(); //Nokia 3110 is turning on
        System.out.println(nokia.getPrice()); //500.0
        nokia.text(25648965); //5648965 is sending message to Nokia

        System.out.println("--------------");
        Phone phone = new Phone("Motorola", "2560",2500, true,true);
        System.out.println(phone); //Device{brand='Motorola', model='2560', price=2500.0, hasPowerButton=true, hasBattery=true}
        System.out.println(phone.getModel()); //2560
        phone.setPrice(750);
        System.out.println(phone); //Device{brand='Motorola', model='2560', price=750.0, hasPowerButton=true, hasBattery=true}

    }
}
