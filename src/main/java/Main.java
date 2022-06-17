import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cart addMovie = new Cart();

        MovieID movie1 = new MovieID(1, "Kino1", "Horror", 60);
        MovieID movie2 = new MovieID(2, "Kino2", "Horror", 61);
        MovieID movie3 = new MovieID(3, "Kino3", "Horror", 62);
        MovieID movie4 = new MovieID(4, "Kino4", "Horror", 63);
        MovieID movie5 = new MovieID(5, "Kino5", "Horror", 64);
        MovieID movie6 = new MovieID(6, "Kino6", "Horror", 65);
        MovieID movie7 = new MovieID(7, "Kino7", "Horror", 66);
        MovieID movie8 = new MovieID(8, "Kino8", "Horror", 67);
        MovieID movie9 = new MovieID(9, "Kino9", "Horror", 68);
        MovieID movie10 = new MovieID(10, "Kino10", "Horror", 69);
        MovieID movie11 = new MovieID(11, "Kino11", "Horror", 70);
        MovieID movie12 = new MovieID(12, "Kino12", "Horror", 71);

        addMovie.addToCart(movie1);
        addMovie.addToCart(movie2);
        addMovie.addToCart(movie3);
        addMovie.addToCart(movie4);
        addMovie.addToCart(movie5);
        addMovie.addToCart(movie6);
        addMovie.addToCart(movie7);
        addMovie.addToCart(movie8);
        addMovie.addToCart(movie9);
        addMovie.addToCart(movie10);
        addMovie.addToCart(movie11);
        addMovie.addToCart(movie12);

        System.out.println("Все фильмы в порядке добавления: ");
        addMovie.showAllCart();
        addMovie.showLastAdded();
        System.out.println("Последние добавленные: ");
        Arrays.stream(addMovie.showLastAdded()).forEach(System.out::println);
    }
}

