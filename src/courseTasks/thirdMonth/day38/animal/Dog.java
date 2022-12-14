package courseTasks.thirdMonth.day38.animal;

public class Dog extends Animal {


    public Dog(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void eat(){
        System.out.println("eats dog food");
    }
}
