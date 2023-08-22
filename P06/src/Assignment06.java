import java.util.ArrayList;
import java.util.List;

public class Assignment06{
    public static void main (String[] args){
        //Q1 Testing ====================================================
        Film film1 = new Film("The Notebook", "Nick Cassavetes", 2900);
        // System.out.println(film1);
        //===============================================================

        //Q2 Testing ====================================================
        Film film2 = new Film("Madagascar", "Eric Darnell", 7500);
        Film film3 = new Film("Shrek", "Andrew Adamson", 6000);
        Film film4 = new Film("Cars", "John Lasseter", 1200);
        Film film5 = new Film("Beauty and the Beast", "John Lasseter", 2500);
        
        List<Film> testFilms = new ArrayList<>();
        testFilms.add(film1);
        testFilms.add(film2);
        Netflix netflix = new Netflix(testFilms); // Adds list of films to netflix object
        System.out.println(netflix.add(film1)); // Returns false
        System.out.println(netflix.add(film2)); // Returns false
        System.out.println(netflix.add(film3)); // Returns true
        System.out.println(netflix.add(film4)); // Returns true
        System.out.println(netflix.add(film5)); // Returns true
        
        System.out.println("Printing Shrek film info");
        System.out.println(netflix.getFilm("Shrek")); // Prints Shrek film info

        System.out.println("Printing Cars and Beauty and the Beast film info");
        System.out.println(netflix.getDirector("John Lasseter")); // Prints Cars and Beauty and the Beast film info

        System.out.println("Printing total budget");
        System.out.println(netflix.totalBudget()); // Prints total bugdet of all films in netflix

        System.out.println("Changing director of Madagascar");
        System.out.println(netflix.getFilm("Madagascar"));
        netflix.changeDirector("Madagascar", "Tom McGrath");
        System.out.println(netflix.getFilm("Madagascar")); // Director has been updated

        System.out.println("Changing the budget for The Notebook");
        System.out.println(netflix.getFilm("The Notebook"));
        netflix.changeBudget("The Notebook", 3300);
        System.out.println(netflix.getFilm("The Notebook")); // The Notebook budget updated from 2900 to 3300

        System.out.println("Printing total budget before increase");
        System.out.println(netflix.totalBudget());
        netflix.increaseBudgetBy(50); // Prints budget increase of 50%

        //===============================================================
    }
}