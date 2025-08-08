import java.io.*;

public class NotesAppService {

    public void addNote(String note) {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("Notes.txt",true))){
            writer.write(note);
            writer.newLine();
            System.out.println("notes written");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewNote() {

        try(BufferedReader reader=new BufferedReader(new FileReader("Notes.txt"))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("notes read");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
