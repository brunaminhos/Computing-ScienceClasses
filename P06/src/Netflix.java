import java.util.ArrayList;
import java.util.List;

public class Netflix implements MovieStream{
    private List<Film> films;

    // Netflix constructor
    public Netflix(List<Film> films){
        this.films = films;
    }

    // Adds film to list if it's not already there
    public boolean add(Film film){
        if (films.contains(film)){
            return false;
        }
        else{
            films.add(film);
            return true;
        }
    }

    // Gets the film by title
    public Film getFilm(String title){
        Film returnFilm = null;
        for (int i = 0; i < films.size(); i++){
            if (films.get(i).getTitle() == title){
                returnFilm = films.get(i);
            }
        }
        return returnFilm;
    }

    // Gets the film by director
    public List<Film> getDirector(String director){
        List<Film> returnFilms = new ArrayList<>();
        for (int i = 0; i < films.size(); i++){
            if (films.get(i).getDirector() == director){
                returnFilms.add(films.get(i));
            }
        }
        return returnFilms;
    }

    // Gets the sum of all budgets
    public double totalBudget(){
        double total = 0;
        for (int i = 0; i < films.size(); i++){
            total += films.get(i).getBudget();
        }
        return total;
    }

    // Changes director for given title
    public boolean changeDirector(String title, String director){
        boolean returnBoolean = false;
        for (int i = 0; i < films.size(); i++){
            if (films.get(i).getTitle() == title){
                double budget = films.get(i).getBudget();
                films.remove(films.get(i));
                films.add(new Film(title, director, budget));
                returnBoolean = true;
            }
        }
        return returnBoolean;
    }

    // Changes budget for given title
    public boolean changeBudget(String title, double b){
        boolean returnBoolean = false;
        for (int i = 0; i < films.size(); i++){
            if (films.get(i).getTitle() == title){
                String director = films.get(i).getDirector();
                films.remove(films.get(i));
                films.add(new Film(title, director, b));
                returnBoolean = true;
            }
        }
        return returnBoolean;
    }

    // Prints total budget increase by a given percentage
    public void increaseBudgetBy(double percent){
        double initialBudget = totalBudget();
        double increasedBudget = initialBudget*(1+(percent/100));
        System.out.println("Budget increased to: " + increasedBudget);
    }
}
