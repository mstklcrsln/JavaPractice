package novemberTasks.day31_Tasks.Task6_RestaurantTask;

import java.nio.channels.SeekableByteChannel;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Mesut","Istanbul",5);

        Server server1 = new Server("Ali",103,1,true);
        Server server2 = new Server("Veli", 105,1.5,false);
        Server server3 = new Server("Fatma", 107,2,true);
        Server server4= new Server("Ayse", 111,2.5,false);

        Server [] allServers = {server1, server2,server3,server4};

        restaurant1.hireServer(allServers);

        Chef chef1= new Chef("Jack",91,0.5,true );
        Chef chef2= new Chef("Adam", 93,1,true);
        Chef chef3= new Chef("Mıhtar", 95,2,false);

        Chef [] allChefs = {chef1, chef2, chef3};

        restaurant1.hireChef(allChefs);

        System.out.println(restaurant1);
        /*
        Restaurant{owner='Mesut', location='Istanbul', numberOfStars=5, serverList=[Server{name='Ali', employeeID=103, hourlyRate=1.0}, Server{name='Veli', employeeID=105, hourlyRate=1.5}, Server{name='Fatma', employeeID=107, hourlyRate=2.0}, Server{name='Ayse', employeeID=111, hourlyRate=2.5}], chefList=[Chef{name='Jack', employeeID=91, hourlyRate=0.5}, Chef{name='Adam', employeeID=93, hourlyRate=1.0}, Chef{name='Mıhtar', employeeID=95, hourlyRate=2.0}]}
         */
    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object
	            - Print your whole restaurants information

 */