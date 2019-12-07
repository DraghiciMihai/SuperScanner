import java.io.*;
import java.util.Scanner;

public class SuperScanner {
    Scanner scanner = new Scanner(System.in);

    public String next(){
        String text = scanner.next();
        return text;
    }

    public String readFromFile(String numeFisier) {
        String totTextul = null;
        File file = new File(numeFisier);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String text;
            totTextul = reader.readLine();
        } catch (IOException ex) {
            System.out.printf("Error : %s", ex);
        }
        return totTextul;
    }

    public void writeToFile(String numeFisier, String textDeScris) {
        File file = new File(numeFisier);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(textDeScris + " ");
            writer.close();
        } catch (IOException ex) {
            System.out.printf("Error : %s", ex);
        }
    }
}