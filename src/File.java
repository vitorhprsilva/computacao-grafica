import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    ArrayList<String> objeto  = new ArrayList<>();

    public ArrayList<String> List(String fileName ) {
        try {
            FileReader file = new FileReader(fileName);
            BufferedReader readFile = new BufferedReader(file);
            String line = readFile.readLine();
            objeto.add(line);
            while (line != null) {
                line = readFile.readLine();
                objeto.add(line);
            }

            file.close();
            return objeto;
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
            return objeto;
        }
    }
}
