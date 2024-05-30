public class Book
{
    public String author;
    public boolean isBorrowed;
    public String name;
    public double price;
    public Book(String name, String author, double price, boolean isBorrowed)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }
}
