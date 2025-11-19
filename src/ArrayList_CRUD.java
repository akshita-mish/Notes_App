import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private float marks;
   static List<Student> list=new ArrayList<>();

    Student(int id,String name,float marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    //Function to add  student
    public static void Add(Student stu){
        list.add(stu);
        System.out.println("Added successfully");
    }
    // Read from an arraylist
    public static  void Read(){
        for(Student s : list){
            System.out.println(s);
        }
    }
    //for updating an object into a list
    public static  void Update(int id,Student s){
        boolean found=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i).id==id){
                list.set(i,s);
                System.out.println("Updated Successfully");
                found=true;
                break;
            }
        }
        if(!(found)) System.out.println("Roll no does not found");

    }
    //deleting an student on the basis of roll no
    public static  void Delete(int id){
       boolean found =false;
       for(int i=0;i<list.size();i++){
           if(list.get(i).id==id){
               list.remove(i);
               System.out.println("Student at roll no "+ i + "has been deleted");
               found=true;
               break;
           }
           if(!(found)) System.out.println("Roll no does not found");
       }
    }
    public String toString(){
        return "{" +id + ","+ name + "," + marks+"}";
    }


}

public class ArrayList_CRUD {

    public static void main(String[] args) {
        //creating object of student class;
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("----CRUD OPERATION USING ARRAYLIST----");
            System.out.println("please enter your choice");
            System.out.println("1 : ADD");
            System.out.println("2 : READ");
            System.out.println("3 : UPDATE");
            System.out.println("4 : DELETE");
            System.out.println("5 : Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student detail");
                    Student s = new Student(sc.nextInt(), sc.next(), sc.nextFloat());
                    Student.Add(s);
                    break;
                case 2:
                    Student.Read();
                    break;
                case 3:
                    System.out.println("Enter details and roll no where u want to change details");
                    System.out.print("Enter id : ");
                    int roll_no = sc.nextInt();
                    System.out.print("Enter name : ");
                    String name = sc.next();
                    System.out.print("Enter marks : ");
                    float marks = sc.nextFloat();

                    Student.Update(roll_no, new Student(roll_no, name, marks));
                    break;
                case 4:
                    System.out.println("Enter students roll number u wanna delete");
                    int roll = sc.nextInt();
                    Student.Delete(roll);
                default:
                    System.out.println("Invalid case !!");
            }

        }
      //  sc.close();



    }

}
