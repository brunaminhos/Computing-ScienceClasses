public class film {
    // creating film attribute
    String name;
    String director;
    int length;
    int cost;

    //constructor sets the details of the film
    public film(String name, String director, int length, int cost){
        this.name = name;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // prints the details of the film
    public void getFilm(){
        String filmLength = Integer.toString(length); 
        String filmCost = Integer.toString(cost); 
        System.out.println("Film name is: " + name); 
        System.out.println("Film director is: " + director);
        System.out.println("Film duration is: " + filmLength + " minutes");
        System.out.println("Film budget is: $" + filmCost);
    }
}
