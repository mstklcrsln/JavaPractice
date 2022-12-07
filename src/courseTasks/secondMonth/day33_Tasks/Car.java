package courseTasks.firstMonth.secondMonth.day33_Tasks;

public class Car {

    public static int numberOfWheels= 4;
    public static boolean hasBattery = false;
    public static boolean hasSeats =true;

    public String make;
    public String model;
    public String color;
    public int year;
    public double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public void drive(){
        System.out.println("you can drive this car");
    }
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
7. Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats
            Add a constructor to initialize all the fields
           Methods:
                drive()
                toString()
 */