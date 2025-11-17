import java.util.Scanner;

public class Library_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Search Book by Author,Category,Title");
            System.out.println("6. Register Member");
            System.out.println("7. View Members");
            System.out.println("8. Issue Book");
            System.out.println("9. Return Book");
            System.out.println("10. View Issued Books");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();
                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();
                    System.out.print("Enter Total Copies: ");
                    int total = sc.nextInt();
                    Book.AddBook(new Book(id,title,author,cat,price,total,total));
                    break;
                case 2:
                    Book.view();
                    break;
                case 3:
                    System.out.print("Enter Book ID to update: ");
                     id = sc.nextInt();
                     sc.nextLine();
                    System.out.print("Enter Title: ");
                     title = sc.nextLine();
                    System.out.print("Enter Author: ");
                     author = sc.nextLine();
                    System.out.print("Enter Category: ");
                     cat = sc.nextLine();
                    System.out.print("Enter Price: ");
                     price = sc.nextInt();
                    System.out.print("Enter Total Copies: ");
                     total = sc.nextInt();
                    System.out.print("Enter Available Copies: ");
                    int available = sc.nextInt();
                    Book.updateBookInfo(id,new Book(id,title,author,cat,price,total,available));
                    break;
                case 4:
                    System.out.println("Enter id  of a book to  delete");
                    id=sc.nextInt();
                    Book.DeleteBook(id);
                    break;
                case 5:
                    System.out.println("enter the name of any author,category and title of the book");
                    sc.nextLine();
                    String str=sc.nextLine();
                    Book.SearchBook(str);
                    break;
                case 6:
                    System.out.print("Enter Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.next();
                    Member.Register(new Member(mid,name,email,phone));
                    break;
                case 7:
                    Member.viewMember();
                    break;
                case 8:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Enter Member ID: ");
                    int memId = sc.nextInt();
                    LibraryService.IssueBook(bid,memId);
                    break;
                case 9:
                    System.out.print("Enter Issue ID to return: ");
                    LibraryService.ReturnBook(sc.nextInt());
                    break;
                case 10:
                       LibraryService.viewIssuedBook();
                       break;
                case 11:
                    System.out.println("Exiting system...");
                    System.exit(0);



            }
        }
    }
}
