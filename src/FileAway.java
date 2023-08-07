import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class FileAway {
    public static void main(String args[]) {
        final JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        File pickedFile=fileChooser.getSelectedFile();
        int lineCount=0;
        int wordCount=0;
        int characterCount=0;
        String line="";
        try {
            Scanner read=new Scanner(pickedFile);
            while(read.hasNextLine()) {
                line=read.nextLine();
                String words[]=line.split(" ");
                characterCount=characterCount+line.length();
                wordCount=wordCount+words.length;
                lineCount=lineCount+1;
            }
        } catch (FileNotFoundException k) {
            k.printStackTrace();}
        System.out.println("File name: "+pickedFile.getName());
        System.out.println("Character count: "+characterCount);
        System.out.println("Word count: "+wordCount);
        System.out.println("Line count: "+lineCount);
    }
}