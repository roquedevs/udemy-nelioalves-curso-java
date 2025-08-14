package files.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {
    public static void main(String[] args) {

        /**
         * Para obter o nome do arquivo: file.getName();
         * Para obter o caminho completo: file.path();
         * Para obter o caminho da pasta: file.getParent();
         */
        File file = new File("C:\\Users\\Israel\\workspaces\\ws-java\\curso-java\\arquivo.txt");
        //file.getName();
        //file.getPath();
        //file.getParent();
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
