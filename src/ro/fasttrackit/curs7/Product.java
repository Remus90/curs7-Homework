package ro.fasttrackit.curs7;

public class Product {
    public String name;
    public int price;
    public int quantity;
    public String category;

    public Product(int quantity, String category) {
        this.quantity = quantity;
        this.category = category;
    }

    String getName() {

        return name;
    }

    int getPrice() {

        return price;
    }

    int getQuantity() {

        return quantity;
    }

    String getCategory() {

        return category;
    }

    public boolean hasStock() {
        return quantity > 0;

    }

    public boolean isCategory(String category) {
        if (this.category.equals(category)) {
            return true;

        } else return false;
    }

    public static void main(String[] args) {
        Product newProduct1 = new Product(12, "Legume");
        System.out.println(newProduct1.hasStock());
        System.out.println(newProduct1.isCategory("Electronice"));
        Product newProduct2 = new Product(5, "Fructe");
        System.out.println(newProduct2.hasStock());
        System.out.println(newProduct2.isCategory("Fructe"));
        Product newProduct3 = new Product(0, "Fotbal");
        System.out.println(newProduct3.hasStock());
        System.out.println(newProduct3.isCategory("Baschet"));


    }
}
