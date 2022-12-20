package courseTasks.thirdMonth.day39_Tasks.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Bear bear = new Bear("Ayicik", "Bozayi", "Big", "Grey", 'M', 20,true,false, false );

        System.out.println("bear = " + bear); //bear = WildAnimal{name='Ayicik', breed='Bozayi', size='Big', color='Grey', gender=M, age=20 isWild=false, isFriendly=false, isPlayable=true}
        System.out.println("-------------------");

        Dog dog = new Dog("Karabas", "Coban", "Big", "White", 'M', 9,false, true,true);
        System.out.println("dog = " + dog); //dog = FriendlyAnimal{name='Karabas', breed='Coban', size='Big', color='White', gender=M, age=9, isWild=false, isFriendly=true, isPlayable=true}
        
        System.out.println("-------------------");

        Cat cat = new Cat("Sarisin", "Van", "Small", "Yellow", 'M',4, false, true,true);
        System.out.println("cat = " + cat); //cat = FriendlyAnimal{name='Sarisin', breed='Van', size='Small', color='Yellow', gender=M, age=4, isWild=false, isFriendly=true, isPlayable=true}
        
        System.out.println("-------------------");
        Crocodile crocodile = new Crocodile("ısırgan", "Crody", "Large", "Green", 'M', 25,true,false,false);
        System.out.println("crocodile = " + crocodile); //crocodile = WildAnimal{name='ısırgan', breed='Crody', size='Large', color='Green', gender=M, age=25 isWild=true, isFriendly=false, isPlayable=false}

        System.out.println("-------------------");
        Dolphin dolphin = new Dolphin("Friend", "dolphy", "Medium", "Grey", 'F', 13,true,true,true);
        System.out.println("dolphin = " + dolphin); //dolphin = FriendlyAnimal{name='Friend', breed='dolphy', size='Medium', color='Grey', gender=F, age=13, isWild=true, isFriendly=true, isPlayable=true}

        System.out.println("-------------------");
        Parrot parrot =new Parrot("Greeny", "Flying Parrot", "Small", "Green", 'M', 26,true, true,false);
        System.out.println("parrot = " + parrot); //parrot = FriendlyAnimal{name='Greeny', breed='Flying Parrot', size='Small', color='Green', gender=M, age=26, isWild=true, isFriendly=true, isPlayable=false}


        System.out.println(bear.getFriendly()); // false
        bear.drink(); //Don't disturb Ayicik Bozayi is drinking now
        System.out.println(bear.getAge()); //20

        dog.play(); //Don't go nearby Karabas Coban is playing game now
        System.out.println(dog.getBreed()); //Coban
        System.out.println(dog.isFriendly()); // true

        crocodile.move(); //Don't go nearby ısırgan Crody is moving now
        System.out.println(crocodile.getColor()); // green
        System.out.println(crocodile.getWild()); //true

        parrot.sing(); //Listen! Greeny Flying Parrot is singing
        parrot.fly(); //Greeny Flying Parrot is flying now
        System.out.println(parrot.getName()); //Greeny
        System.out.println(parrot.isFriendly()); //true
    }
}
