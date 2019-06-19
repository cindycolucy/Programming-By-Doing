import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {

    public static void main(String args[]) throws IOException {
        File letter = new File("letter.txt");
        FileWriter fw =new FileWriter(letter);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("+--------------------------------------------------------------+");
        pw.println("|                                                         #### |");
        pw.println("|                                                         #### |");
        pw.println("|                                                         #### |");
        pw.println("|                                                              |");
        pw.println("|                             Cindy Colucy                     |");
        pw.println("|                             229 Fallis Rd                    |");
        pw.println("|                             Columbus, OH 43214               |");
        pw.println("|                                                              |");
        pw.println("+--------------------------------------------------------------+");
        pw.close();
    }
}
