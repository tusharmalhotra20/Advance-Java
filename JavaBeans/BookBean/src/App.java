import com.example.Book;

public class App {
    public static void main(String[] args) {

        Book myBook = new Book(); // Create a Book object

        myBook.setTitle("The Lord of the Rings");

        myBook.setAuthor("J.R.R. Tolkien");

        myBook.setYearPublished(1954);

        System.out.println("Book Title: " + myBook.getTitle());

        System.out.println("Book Author: " + myBook.getAuthor());

        System.out.println("Year Published: " + myBook.getYearPublished());
    }
}
