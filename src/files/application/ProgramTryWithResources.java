package files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryWithResources {
    public static void main(String[] args) {

        String filename = "C:\\Users\\Israel\\workspaces\\ws-java\\curso-java\\input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
