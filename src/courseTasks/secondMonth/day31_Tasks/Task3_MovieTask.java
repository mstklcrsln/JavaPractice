package courseTasks.firstMonth.secondMonth.day31_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_MovieTask {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Task3_MovieTask(String country, String title, String releaseDate, String director, String genre) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.genre=genre;
    }
    public void addCast (String name){
        casts.add(name);
    }
    public void addCasts (String [] names){
        casts.addAll(Arrays.asList(names));
    }
    public String toString() {
        return "Task3_MovieTask{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
/*
3. Movie Task:
	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */
