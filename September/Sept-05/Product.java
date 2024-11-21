public class Product {
    String title;
    String name;
    String brand;
    int stock;
    boolean inStock;
    double price;
    
    public Product(String title, String brand, int stock, double price) {
        this.title = title;
        this.brand = brand;
        this.stock = stock;
        this.price = price;
    }
    
    void printDetails() {
        System.out.println("Product details:");
        System.out.println(title + " " + brand + " " + price);
    }
    
    boolean inStock() {
        if (stock > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    void reStock(int value) {
        stock += value;
    }
    
    void sell() {
        if (inStock()) {
            stock -= 1;
        } else {
            reStock(100);
            stock -= 1;
        }
        
        System.out.println("Congratulations! you bought " + title + ". Remaining stock: " + stock);
    }
    
    double applyDiscount(double discount) {
        return price - (price * discount / 100.0);
    }
    
    
}