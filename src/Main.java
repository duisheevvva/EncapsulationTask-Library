import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Book book1 = new Book();
     book1.setId(1);
     book1.setName("Pollyanna");
     book1.setAuthorName("Elinor Porter");
     book1.setPrice(600);
     book1.setPublishedYear(LocalDate.of(1999,4,3));

     Book book2 = new Book();
     book2.setId(2);
     book2.setName("Harry Potter");
     book2.setAuthorName("Jon Roulin");
     book2.setPrice(500);
     book2.setPublishedYear(LocalDate.of(1997,4,3));

     Book [] books = {book1,book2};

     Library library = new Library();
     library.setId(1);
     library.setName("Bayalinova");
     library.setBooks(books);

     while (true){
      System.out.println("Write command: ");
      int command = new Scanner(System.in).nextInt();
      switch (command){
       case 1 -> library.getAllBooks();
       case 2 -> library.getByIdBook(2);
      }
     }



    }
}