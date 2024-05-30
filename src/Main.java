import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("系统启动");
        Scanner in = new Scanner(System.in);
        Library myLittleLibrary = new Library();
        //输入图书馆中书籍的总数
        System.out.println("输入图书馆中书籍的总数:");
        myLittleLibrary.getBooksNum(in.nextInt());
        //输入书籍
        System.out.println("输入书籍:");
        myLittleLibrary.Init();
        //显示当前书籍信息
        System.out.println("当前书籍信息:");
        myLittleLibrary.getAllBooks();
        //输入读者姓名
        System.out.println("输入读者姓名:");
        Reader oneBeautifulGril = new Reader(in.next());
        //输入第一次待查找书籍的名称
        System.out.println("输入第一次待查找书籍的名称:");
        myLittleLibrary.FindBook(in.next());
        //输入在第一次查找后待查找书籍作者的名字
        System.out.println("输入在第一次查找后待查找书籍作者的名字:");
        int twiceRes = myLittleLibrary.FindBookInRes(in.next());
        //借走书籍
        oneBeautifulGril.BorrowBook(myLittleLibrary.books.get(twiceRes));
        //借走书籍后，所有书籍的信息
        System.out.println("借走书籍后，所有书籍的信息:");
        myLittleLibrary.getAllBooks();
        //归还书籍
        oneBeautifulGril.ReturnBook(myLittleLibrary.books.get(twiceRes));
        //归还书籍后，所有书籍的信息
        System.out.println("归还书籍后，所有书籍的信息:");
        myLittleLibrary.getAllBooks();
    }
}