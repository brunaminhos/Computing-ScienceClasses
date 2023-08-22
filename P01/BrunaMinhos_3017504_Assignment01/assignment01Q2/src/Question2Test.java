public class Question2Test {
    public static void main(String[] args){
        film film1 = new film("The Notebook", "Nick Cassavetes", 124, 29000000);
        film1.getFilm(); // should print film details above
        film film2 = new film("Titanic", "James Cameron", 195, 200000000);
        film2.getFilm(); // should print film details above
        film film3 = new film("Legally Blonde", "Robert Luketic", 96, 18000000);
        film3.getFilm(); // should print film details above
    }
}
