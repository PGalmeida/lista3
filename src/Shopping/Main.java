package Shopping;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, 10.99f, "Product 1");
        Product prod2 = new Product(2, 20.49f, "Product 2");
        Product prod3 = new Product(3, 15.75f, "Product 3");

        ShoppingCart cart1 = new ShoppingCart(1, 0.0f);
        ShoppingCart cart2 = new ShoppingCart(2, 0.0f);

        cart1.addCarItem(1, 2, prod1);
        cart1.addCarItem(2, 1, prod2);

        cart2.addCarItem(1, 3, prod2);
        cart2.addCarItem(2, 1, prod3);

        System.out.println("Shopping Cart 1:");
        System.out.println(cart1);

        System.out.println("Shopping Cart 2:");
        System.out.println(cart2);
    }
}
