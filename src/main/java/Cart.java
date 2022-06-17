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

    public void showAllCart() {
        for (int i = 0; i < this.cart.length; i++) {
            System.out.println(this.cart[i]);
        }
    }

    public MovieID[] showLastAdded() {
        MovieID[] showLast = new MovieID[numberOfRecentMovie];
        for (int i = 0; i < numberOfRecentMovie; i++) {
            int index = this.cart.length - i - 1;
            if (index >= 0) {
                showLast[i] = this.cart[index];
            }
        }
        return showLast;
    }
}

