package courseTasks.firstMonth.secondMonth.day33_Tasks;

public class Person {

    public static boolean isHuman= true;
    public static boolean hasNose= true;
    public static boolean hasWings = false;
    public static int numberofHead= 1;
    public static int numberOfEyes= 2;

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String eat(String food) {
        return name+ " is eating";
    }

    public String drink(String drink){
        return name+ " is drinking";
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
3. Person Task:
		1. Create a class named Person:
				Attributes:
					instance: name, age, gender
					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
				Add a constructor that can set All the fields (instances)
				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */