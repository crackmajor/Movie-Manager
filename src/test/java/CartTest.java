import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTest {
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

    @Test
    public void addToCart4Movies() {
        Cart addMovie = new Cart();
        addMovie.addToCart(movie1);
        addMovie.addToCart(movie2);
        addMovie.addToCart(movie3);
        addMovie.addToCart(movie9);

        MovieID[] actual = addMovie.cart;
        MovieID[] expected = {movie1, movie2, movie3, movie9};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast5AddedToCart() {
        Cart addMovie = new Cart(5);
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

        MovieID[] actual = addMovie.showLastAdded();
        MovieID[] expected = {movie12, movie11, movie10, movie9, movie8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedIfCartMoviesLessThanTheLimit() {
        Cart addMovie = new Cart();
        addMovie.addToCart(movie1);
        addMovie.addToCart(movie2);
        addMovie.addToCart(movie3);
        addMovie.addToCart(movie4);
        addMovie.addToCart(movie5);
        addMovie.addToCart(movie6);
        addMovie.addToCart(movie7);
        addMovie.addToCart(movie8);
        addMovie.addToCart(movie9);

        MovieID[] actual = addMovie.showLastAdded();
        MovieID[] expected = {movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1, null};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedIfCartMoviesEqualsLimit() {
        Cart addMovie = new Cart(2);
        addMovie.addToCart(movie1);
        addMovie.addToCart(movie2);

        MovieID[] actual = addMovie.showLastAdded();
        MovieID[] expected = {movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
