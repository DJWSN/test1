import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Library
{
    Scanner in = new Scanner(System.in);
    public HashMap<Integer, Book> books = new HashMap<Integer, Book>();
    private int booksNum;
    public int[] res = new int[100];
    public void getBooksNum(int booksNum)
    {
        this.booksNum = booksNum;
    }
    public void Init()
    {
        for(int i = 0; i < booksNum; i++)
        {
            String name = in.next();
            String author = in.next();
            double price = in.nextDouble();
            String borrow = in.next();
            boolean isBorrowed = false;
            if(borrow.equals("可借"))
                isBorrowed = false;
            else if(borrow.equals("未还"))
                isBorrowed = true;
            books.put(i + 1, new Book(name, author, price, isBorrowed));
        }
    }
    public void FindBook(String bookName)
    {
        for (int i = 0; i < booksNum; i++)
        {
            if(books.get(i + 1).name.equals(bookName))
                System.out.println("编号:" + (i + 1));
            res[i + 1] = 1;
        }
    }
    public int FindBookInRes(String author)
    {
        int twiceRes = 0;
        for (int i = 0; i < booksNum; i++)
        {
            if(res[i + 1] == 1)
            {
                if(books.get(i + 1).author.equals(author))
                {
                    twiceRes = i + 1;
                    break;
                }
            }
        }
        return twiceRes;
    }
    public void getAllBooks()
    {
        for (int i = 0; i < booksNum; i++)
        {
            System.out.print(books.get(i + 1).name + books.get(i + 1).author + books.get(i + 1).price + " ");
            if(!books.get(i + 1).isBorrowed)
                System.out.println("可借");
            else
                System.out.println("未还");
        }
    }
}
