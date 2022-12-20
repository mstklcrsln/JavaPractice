package courseTasks.thirdMonth.day38.animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Tekir", "Van", "White",'F', 'M',6);
        Dog dog = new Dog("Karabas", "Coban", "Black", 'M', 'B',9);
        Eagle eagle = new Eagle("Flyer", "Mountain", "Grey", 'M', 'S',15);
        Tiger tiger = new Tiger("Eater", "Tiger", "yellow", 'F', 'B', 20);

        System.out.println("cat = " + cat); //cat = Animal{name='Tekir', breed='Van', color='White', gender=F, size=M, age=6}
        System.out.println("dog = " + dog); //dog = Animal{name='Karabas', breed='Coban', color='Black', gender=M, size=B, age=9}
        System.out.println("eagle = " + eagle); //eagle = Animal{name='Flyer', breed='Mountain', color='Grey', gender=M, size=S, age=15}
        System.out.println("tiger = " + tiger); // tiger = Animal{name='Eater', breed='Tiger', color='yellow', gender=F, size=B, age=20}

        cat.eat(); // eats cat food
        System.out.println(tiger.color); //yellow
        System.out.println(eagle.name); //Flyer
        dog.eat();      // eats dog food
        System.out.println(dog.breed); // Coban


    }
}
