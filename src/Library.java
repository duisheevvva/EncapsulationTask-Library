import java.util.Arrays;

public class Library {
    private int id;
    private String name;
    private Book[] books;

    public Library() {
    }

    public Library(int id, String name, Book[] books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }




    public void addBook(Book book){
        Book[] newBooks = new Book[books.length + 1];;
        System.arraycopy(books, 0, newBooks, 0, books.length);




    }

   public void getAllBooks(){
       for (Book book:books) {
           System.out.println(book);
       }
   }

   public void getByIdBook(int bookId){
       for (Book book:books) {
          if (book.getId() == bookId){
              System.out.println(book);
          }else {
              System.out.println("Not found!");
          }
       }
   }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
