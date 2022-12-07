package courseTasks.firstMonth.secondMonth.day33_Tasks;

public class Dog {

    public static int numberOfLegs=4;
    public  static int numberOfEyes= 2;
    public static int numberOfWings=0;
    public static boolean isFriendly = true;

    public String breed;
    public String size;
    public char gender;
    public  int age;
    public String color;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("eating now");
    }

    public void sleep(){
        System.out.println("is sleeping now");
    }

    public void play(){
        System.out.println("is playing now");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly
	            Add a constructor to initialized all the fields (instances)
	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */