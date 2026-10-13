import java.util.*;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product is required.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        for (int i = 0; i < items.size(); i++) {
            CartItem item = items.get(i);
            if (item.getProduct().getId() == product.getId()) {
                items.set(i, new CartItem(product, item.getQuantity() + quantity));
                return;
            }
        }

        items.add(new CartItem(product, quantity));
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("🛒 Cart is empty.");
            return;
        }

        System.out.println("\n🛒 Your Shopping Cart:");
        for (CartItem item : items) {
            item.display();
        }
        System.out.println("Total: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty. Add products to checkout.");
            return;
        }

        displayCart();
        System.out.println("✅ Checkout complete. Thank you for shopping!");
        items.clear();
    }
}
