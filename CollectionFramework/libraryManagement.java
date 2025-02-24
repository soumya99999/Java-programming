import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(){
        super();
    }

    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Available=" + isAvailable +
                '}';
    }
}

class Library{
    ArrayList<Book> books;
    Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book Added:"+book.getTitle());
    }
    public void display(){
        for(Book book:books){
            if(book.isAvailable()){
                System.out.println(book);
            }
        }
    }

    public boolean search(String Author){
        for(Book book:books){
            if(book.getAuthor().contains(Author))
                return true;
        }
        return false;
    }

    public void displayAll(){
        for(Book book:books){
            System.out.println(book);
        }
    }

    public void Remove(String ISBN){
        books.removeIf(n->(n.getISBN().contains(ISBN)));
    }
}
public class libraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming","John Doe","1234567890",true);
        Book book2 = new Book("C++ Programming","Ram","12348787890",false);
        Book book3 = new Book("DataStructures","John Doe","127557890",true);


        Library books = new Library();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        books.display();

        boolean result = books.search("John Doe");
        if(result) System.out.println("Yes it's present");
        else System.out.println("No it's not present");

        books.Remove("12348787890");
        books.displayAll();
        System.out.println();
        books.Remove("127557890");
        books.displayAll();
    }
}