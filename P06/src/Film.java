final class Film {
    private final String title, director;
    private final double budget;

    public Film(String title, String director, double budget) {
        this.title = title;
        this.director = director;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getBudget() {
        return budget;
    }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setDirector(String director) {
    //     this.director = director;
    // }

    // public void setBudget(double budget) {
    //     this.budget = budget;
    // }

    public String toString() {
        return "Title: " + title + "    Director: " + director + "    Budget: " + budget;
    }
}