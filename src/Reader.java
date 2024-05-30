public class Reader
{
    private String name;
    public void BorrowBook(Book book)
    {
        book.isBorrowed = true;
    }
    public void ReturnBook(Book book)
    {
        book.isBorrowed = false;
    }
    public Reader(String name)
    {
        this.name = name;
    }

}
