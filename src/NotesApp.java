import java.io.*;
import java.util.Scanner;

public class NotesApp {
    //-------------ADD NOTE----------------
    public static void addNotes(Scanner sc) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("MyNote.txt"));
            System.out.println("Enter your note :");
            String note = sc.nextLine();
            bw.write(note);
            bw.newLine();
            bw.close();
            System.out.println("Note is added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //-------------VIEW NOTE--------------
    public static void viewNotes() {
        try {
            File f = new File("MyNote.txt");
            if (!(f.exists())) {
                System.out.println("File does not exist");
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            System.out.println("\n---- Your Notes ----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ------------------ SEARCH NOTE ------------------
    public static void searchNote(Scanner sc) {
        try {
            System.out.print("Enter keyword to search: ");
            String keyword = sc.nextLine();

            File f = new File("MyNote.txt");

            if (!f.exists()) {
                System.out.println("No notes available!");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            boolean found = false;

            System.out.println("\nSearch results:");
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("* " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching notes found!");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ------------------ DELETE ALL NOTES ------------------
    public static void deleteNotes() {
        File f = new File("MyNote.txt");
        if (f.exists()) {
            f.delete();
            System.out.println("All notes deleted!");
        } else {
            System.out.println("No notes to delete!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== NOTES APP =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Search Note");
            System.out.println("4. Delete All Notes");
            System.out.println("5. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    NotesApp.addNotes(sc);
                    break;
                case 2:
                    NotesApp.viewNotes();
                    break;
                case 3:
                    NotesApp.searchNote(sc);
                    break;
                case 4:
                    NotesApp.deleteNotes();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}









