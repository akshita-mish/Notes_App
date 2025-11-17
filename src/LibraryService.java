import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService {
   static  List<IssuedBook> isu=new ArrayList<>();
    static int issueCounter = 1;


    //IssueBook
    public static void IssueBook(int bookid,int memberId){
        Book selectedBook=null;
        Member selectedMember =null;
        int issuecounter=1;
        //check for the book
       for(Book b:Book.list){
           if(b.getBookId()==bookid){
               selectedBook=b;
               break;
           }
       }
       //check for members
        for(Member m:Member.mem){
            if(m.getMemberId()==memberId){
                selectedMember=m;
                break;
            }
        }
        if(selectedBook==null){
            System.out.println("Book not found");
            return;
        }
        if(selectedMember==null){
            System.out.println("Member not found");
            return ;
        }
        if(selectedBook.getAvailableCopies()<=0){
            System.out.println("Book not found");
            return ;
        }
        IssuedBook ib= new IssuedBook(issueCounter++,bookid,memberId,  new Date(), null,0.0);
        isu.add(ib);
        selectedBook.setAvailableCopies(selectedBook.getAvailableCopies()-1);
        System.out.println("Book has been issued successfully");
        System.out.println(ib);

    }
    //Return book
    public static void ReturnBook(int issuedId) {
        IssuedBook record = null;
        for (IssuedBook ib : isu) {
            if (ib.getIssuedId() == issuedId) {
                record = ib;
                break;
            }
        }
            if (record == null) {

                System.out.println("Issued record not found");
                return;
            }

        record.setReturnDate(new Date());

        // Increase available copies
        for (Book b : Book.list) {
            if (b.getBookId() == record.getBookId()) {
                b.setAvailableCopies(b.getAvailableCopies() + 1);
            }
        }
        System.out.println("Book returned successfully!");
        System.out.println(record);
        //count the days between two dates
        long days = ChronoUnit.DAYS.between(record.getIssuedDate().toInstant(),record.getReturnDate().toInstant());
        long allowedDays = 7;  // how many days library allows
        if(days>allowedDays){
            double fine=(days-allowedDays)*100;
            record.setFine(fine);

        }

    }

    //view all the books
    public static void viewIssuedBook(){
        if(isu.isEmpty()){
            System.out.println("No book is issued");
        }
        for(IssuedBook is:isu){
            System.out.println(is);
        }
    }

}
