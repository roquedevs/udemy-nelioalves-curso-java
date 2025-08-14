package files.application;

import java.io.File;
import java.util.Scanner;

public class ProgramFolders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Lista de Pastas:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println("---------------------");

        File[] files = path.listFiles(File::isFile);
        System.out.println("Lista de Arquivos:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Sub-diretório criado com sucesso! " + sucess);

        System.out.println("Lista de Pastas:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        sc.close();
    }
}
