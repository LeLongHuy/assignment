package assignment;

public class Book {
    String title;
    String author;
    double price;
    boolean inStock;

    public Book(String title, String author, double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public void printInfo() {
        System.out.println("Ten sach: " + title + " | Tac gia: " + author + " | Gia: " + price + " | Con hang: " + inStock);
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Toan cao cap", "Nguyen Van A", 50000, true);
        Book b2 = new Book("Lap trinh Java", "Tran Van B", 120000, true);
        Book b3 = new Book("Dac Nhan Tam", "Dale Carnegie", 80000, false);

        System.out.println("Truoc khi giam gia:");
        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        // Giam 10%
        b1.applyDiscount(10);
        b2.applyDiscount(10);
        b3.applyDiscount(10);

        System.out.println("\nSau khi giam 10%:");
        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}