import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test.");
            writer.close();

            // Reading from file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
