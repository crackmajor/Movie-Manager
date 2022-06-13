public class Cart {
    private int numberOfRecentMovie = 10;

    public Cart() {

    }

    public Cart(int numberOfRecentMovie) {
        this.numberOfRecentMovie = numberOfRecentMovie;
    }

    public MovieID[] cart = new MovieID[0];

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
        if (numberOfRecentMovie < 0) {
            this.numberOfRecentMovie = 0;
        }
        if (numberOfRecentMovie > this.cart.length){
            this.numberOfRecentMovie = this.cart.length;
        }
        MovieID[] showLast = new MovieID[numberOfRecentMovie];
        for (int i = 0; i < numberOfRecentMovie; i++) {
            int index = this.cart.length - i - 1;
            showLast[i] = this.cart[index];
        }
        return showLast;
    }
}
