package courseTasks.thirdMonth.day38.animal;

public class Eagle extends Animal {


    public Eagle(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void eat(){
        System.out.println(name+ " is eating snake");
    }

}
