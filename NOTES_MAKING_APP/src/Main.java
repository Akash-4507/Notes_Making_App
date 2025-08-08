import javax.swing.plaf.PanelUI;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotesAppService notesAppService=new NotesAppService();
        while(true) {
            System.out.println("Welcome to the notes app");
            System.out.println("1. Add a Note");
            System.out.println("2. view all notes");
            System.out.println("3. Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter the note");
                    String note = input.nextLine();
                    notesAppService.addNote(note);
                    break;
                case 2:
                    notesAppService.viewNote();
                    break;
                case 3:
                    System.out.println("Exit application bye bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }



    }
}