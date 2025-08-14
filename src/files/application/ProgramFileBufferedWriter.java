package files.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[] { "Uva", "Morango", "Banana", "Maçã", "Melancia", "Abacaxi", "Melão" };
        String path = "C:\\Users\\Israel\\workspaces\\ws-java\\curso-java\\output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " +  e.getMessage());
        }
    }
}
