package courseTasks.thirdMonth.day39_Tasks.animalTask;

public class WildAnimal extends  Animal {

    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public boolean getWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean getFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean getPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void hunt (){
        System.out.println("Don't disturb "+ getName() + " "+ getBreed()+ " is hunting");
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
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                " isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}

/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()

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