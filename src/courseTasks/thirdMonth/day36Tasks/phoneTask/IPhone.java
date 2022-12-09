package courseTasks.thirdMonth.day36Tasks.phoneTask;

public class IPhone extends Phone {
    public IPhone( String model, String size, String color, double price) {
        super("IPhone", model, size, color, price);
    }

    public void facetime (long number){
        System.out.println(getBrand()+ " " + getModel()+ " is having a facetime calling with number with"+ number);
    }
    public void facetime (String email){
        System.out.println(getBrand()+ " " + getModel()+ " is having a facetime calling with number with "+ email);
    }


    public String toString() {
        return "IPhone{}";
    }
}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */