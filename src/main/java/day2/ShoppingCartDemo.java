package day2;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Coffee", 2.50);
        Product product2 = new Product("Eggs", 3.50);
        Product product3 = new Product("Milk", 4.50);

        // Create an instance of ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add products to the cart
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        // Remove a product from the cart
        shoppingCart.removeProduct(product1);

        // Calculate and display the total price of the cart
        shoppingCart.getTotalPrice();

        // Display the items in the cart
        shoppingCart.displayCart();
    }
}
