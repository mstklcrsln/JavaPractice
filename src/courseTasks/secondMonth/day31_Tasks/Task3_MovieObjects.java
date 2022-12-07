package courseTasks.firstMonth.secondMonth.day31_Tasks;

public class Task3_MovieObjects {
    public static void main(String[] args) {

        Task3_MovieTask movieObjects= new Task3_MovieTask("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay", "Adventure, Comedy, Thriller");
        movieObjects.addCast("Omer");
        String [] names= {"Asiya, Adam, Muhtar, Mesut, Veli, Mustafa, Surhay, Serkan"};
        movieObjects.addCasts(names);

        System.out.println(movieObjects); /* Task3_MovieTask{country='USA', title='Journey to SDET: Cydeo Batch 25', genre='Adventure, Comedy, Thriller', releaseDate='10/25/2021', releaseDate='10/25/2021', total number of casts=2}
         */
    }
}
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */