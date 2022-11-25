package novemberTasks.day33_Tasks;

public class IPhone {

    public static String brand= "I Phone";
    public static String operatigSystem= "IOS";
    public static String madeIn= "China";

    public String model;
    public double price;
    public String color;
    public String size;

    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    public long faceTime(long phoneNumber){
        return phoneNumber;
    }
    public String faceTime(String email){
        return email;
    }
    public long call(long phoneNumber){
        return phoneNumber;
    }
    public String text(long phoneNumber){
        return text(phoneNumber);
    }
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */