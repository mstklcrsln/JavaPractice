package courseTasks.thirdMonth.day39_Tasks.animalTask;

public class FriendlyAnimal extends  Animal {

    private boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play (){
        System.out.println("Don't go nearby " + getName()+ " " + getBreed() + " is playing game now");
    }

    public void pet (){
        System.out.println(getName()+ " "+ getBreed() + " is a pet");
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

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}

/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

					Day 39 Notes:

  while creating child class:
    1- Add the features that can not be inherited from parent class.
    So constructor will get these
    2- add getter and setter, because they will not be inherited from parent class
    3- add requirements to the setter to be sure that user can not put negative numbers
    4- After finishing these phases apply the extends keyword
    5- Add constructor with all these fields (length, width)
    6- Work on other methods about rectangle
    7- Override methods from parent class, by right click/generate/override
    8- Generate the toString method in the rectangle class for include length and width
    9- Add knowledge about area and perimeter into the toString method
 */