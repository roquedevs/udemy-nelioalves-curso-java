package files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileBufferReader {
    public static void main(String[] args) {

        String filename = "C:\\Users\\Israel\\workspaces\\ws-java\\curso-java\\input.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch(IOException e){
            System.out.println("Erro ao ler arquivo: " +  e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
