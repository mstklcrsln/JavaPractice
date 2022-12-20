package courseTasks.thirdMonth.day39_Tasks.animalTask;

public class Dolphin extends  FriendlyAnimal {

    public Dolphin(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void swim (){
        System.out.println( getName()+  " "+ getBreed()+ " is swimming now");
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pet() {
        super.pet();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void move() {
        super.move();
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */