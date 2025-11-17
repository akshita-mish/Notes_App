import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    private String email;
    private String phoneNumber;
   static  List<Member> mem= new ArrayList<>();

    public Member(int memberId, String name, String email, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //registration of a new member
    public static void Register(Member m){
        mem.add(m);
        System.out.println("Registered successfully");
    }
    //view all member
    public static  void viewMember(){
        for(Member m:mem){
            System.out.println(m);
        }
    }
    //update member details
    public static void updateMember(int id,Member m){
        boolean found=false;
        for(int i=0;i<mem.size();i++){
            if(mem.get(i).memberId==id){
                mem.set(i,m);
                System.out.println("Member details updated successfully");
                found =true;
                break;
            }
        }
        if(!(found)) System.out.println("Member does not exist");
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static List<Member> getMem() {
        return mem;
    }

    public static void setMem(List<Member> mem) {
        Member.mem = mem;
    }

    //delete member
    public static void deleteMember(int id,Member m){
        boolean found=false;
        for(int i=0;i<mem.size();i++){
            if(mem.get(i).memberId==id){
                mem.remove(i);
                System.out.println("Member details deleted successfully");
                found =true;
                break;
            }
        }
        if(!(found)) System.out.println("Member does not exist");
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
