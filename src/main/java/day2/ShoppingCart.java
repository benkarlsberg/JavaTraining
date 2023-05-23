package day2;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Added " + product.getName());
    }

    public void removeProduct(Product product) {
        items.remove(product);
        System.out.println("Removed " + product.getName());
    }

    public void getTotalPrice() {
        double totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total Cart Price is: $" + totalPrice);
    }

    public void displayCart() {
        System.out.println("Cart items");
        for (Product product : items) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }

}
