package courseTasks.thirdMonth.day38.animal;

public class Animal {
    public String name, breed, color;
    public char gender, size;
    public int age;

    public Animal(String name, String breed, String color, char gender, char size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+ " "+ breed+ " is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
