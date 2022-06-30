import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        GroupOfStudents group = new GroupOfStudents();
        File file = new File("NewFile.txt");
        file.createNewFile();
        BufferedReader br = null;
            PrintWriter pw = new PrintWriter(file);
            pw.print(group.group[0]);
            pw.close();

            br = new BufferedReader(new FileReader(file.getName()));
            String line;

            while((line = br.readLine()) != null){
                String[] s = line.split("\t");
                for (String rs: s) {
                    System.out.println(rs);
                }
            }
            br.close();






    }
}
