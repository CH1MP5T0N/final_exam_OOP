package exams;

public class Book{
    public String title;
    public double price;
    public int year;
    public String author;
    public Book(String author, String title, double price, int year){
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }
    public String toString(){
        return author + ", " + title + ", $" + price + ", " + year;
    }

    public static void main(String[] args) {
        Book thisbook = new Book("Raymond Bahana", "SuperHeroes are Real", 15.50, 1719);
        Book thatbook = new Book("Nunung Nurul", "Falling in love with Data Structures", 12.80, 1902);
        Book hisbook = new Book("Ardimas Andi Purwita", "Secure My Network", 24.50, 2021);
        Book weeb = new Book("Jude Martinez", "Bakemonogatari", 9.50, 1996);
        Book o = new Book("Ida Bagus", "The Young Doctor", 900, 1974);
        System.out.println("1. "+thisbook);
        System.out.println("2. "+thatbook);
        System.out.println("3. "+hisbook);
        System.out.println("4. "+weeb);
        System.out.println("5. "+o);
    }
}
