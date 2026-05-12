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
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá bán: $" + price);
        System.out.println("Tình trạng: " + (inStock ? "Còn hàng" : "Hết hàng"));
        System.out.println("---------------------------------");
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountAmount = price * (percent / 100);
            price = price - discountAmount;
            System.out.println("[!] Đã áp dụng giảm " + percent + "% cho sách: " + title);
        } else {
            System.out.println("Phần trăm giảm giá không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 40.0, true);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 50.0, true);
        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", 45.0, false);

        System.out.println("=== THÔNG TIN SÁCH BAN ĐẦU ===");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println("\n=== THỰC HIỆN GIẢM GIÁ ===");
        book1.applyDiscount(10);
        book2.applyDiscount(10);
        book3.applyDiscount(10);

        System.out.println("\n=== THÔNG TIN SÁCH SAU KHI GIẢM GIÁ 10% ===");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}