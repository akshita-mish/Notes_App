import java.util.Date;

public class IssuedBook {
    private int issuedId;
    private int bookId;
    private int memberId;
    private Date issuedDate;
    private Date returnDate;
    private double fine;

    public IssuedBook(int issuedId, int bookId, int memberId, Date issuedDate, Date returnDate, double fine) {
        this.issuedId = issuedId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public int getIssuedId() {
        return issuedId;
    }

    public void setIssuedId(int issuedId) {
        this.issuedId = issuedId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "IssuedBook{" +
                "issuedId=" + issuedId +
                ", bookId=" + bookId +
                ", memberId=" + memberId +
                ", issuedDate=" + issuedDate +
                ", returnDate=" + returnDate +
                ", fine=" + fine +
                '}';
    }
}
