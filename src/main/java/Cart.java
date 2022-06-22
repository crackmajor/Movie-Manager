public class Cart {
    private int numberOfRecentMovie = 10;
    public MovieID[] cart = new MovieID[0];

    public Cart() {
    }

    public Cart(int numberOfRecentMovie) {
        this.numberOfRecentMovie = numberOfRecentMovie;
    }

    public MovieID[] addToCart(MovieID cart) {
        int length = this.cart.length + 1;
        MovieID[] tmpCart = new MovieID[length];
        for (int i = 0; i < this.cart.length; i++) {
            tmpCart[i] = this.cart[i];
        }
        int lastIndex = tmpCart.length - 1;
        tmpCart[lastIndex] = cart;
        this.cart = tmpCart;
        return tmpCart;
    }

    public MovieID[] findAll() {
        return cart;
    }

    public MovieID[] showLastAdded() {
        int showLastIndex = numberOfRecentMovie;
        if (numberOfRecentMovie > cart.length) {
            showLastIndex = cart.length;
        }
        MovieID[] showLast = new MovieID[showLastIndex];
        for (int i = 0; i < showLastIndex; i++) {
            int index = this.cart.length - i - 1;
            showLast[i] = this.cart[index];
        }
        return showLast;
    }
}

