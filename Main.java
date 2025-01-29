

class book{
    private String title;
    private String author;
    private double price;
    public book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;


    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        book a=new book("SDET Training Note", "Aryan", 500);
        a.displayDetails();
        
    }
    
}
