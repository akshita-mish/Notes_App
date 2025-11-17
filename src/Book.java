import java.util.ArrayList;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int price;
    private int totalCopies;
    private int availableCopies;
    static ArrayList<Book> list=new ArrayList<>();

    public Book(int bookId, String title, String author, String category, int price, int totalCopies, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }
    //Adding a book
  public static void AddBook(Book b){
        list.add(b);
        System.out.println("Book Added Successfully");
    }
    //View book
    public static void view(){
        for(Book b : list){
            System.out.println(b);
        }
    }
    //update book details
    public static void updateBookInfo(int id, Book b){
        boolean found=false;
        for(int i=0;i< list.size();i++) {
            if (list.get(i).bookId == id) {
                list.set(i, b);
                System.out.println("Updated successfully");
                found = true;
                break;
            }
        }
            if(!(found)) System.out.println("Book does not exists");


    }
    //Delete book
    public static void DeleteBook(int id){
        boolean found=false;
        for(int i=0;i< list.size();i++) {
            if (list.get(i).bookId == id) {
                list.remove(i);
                System.out.println("Deleted successfully");
                found = true;
                break;
            }
        }
            if(!(found)) System.out.println("Book does not exists");


    }
    //Search Book by Author,titleand category
    public static void SearchBook( String s) {
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).author.equalsIgnoreCase(s) || list.get(i).title.equalsIgnoreCase(s)
                    || list.get(i).category.equalsIgnoreCase(s)) {
                System.out.println(list.get(i));
                found = true;
            }

        }
        if (!(found)) System.out.println("Book does not exists");

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", totalCopies=" + totalCopies +
                ", availableCopies=" + availableCopies +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public static ArrayList<Book> getList() {
        return list;
    }

    public static void setList(ArrayList<Book> list) {
        Book.list = list;
    }
}
