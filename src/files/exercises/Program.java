package files.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine().trim();

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line =  br.readLine();
            while (line != null) {
                String name = line.split(",")[0];
                double price = Double.parseDouble(line.split(",")[1]);
                int quantity = Integer.parseInt(line.split(",")[2]);

                Product product = new Product(name, price, quantity);
                products.add(product);

                line = br.readLine();
            }

            File outDir = new File(new File(path).getParent() + File.separator + "out");
            if (!outDir.exists()) outDir.mkdir();

            String newPath = outDir + File.separator + "summary.csv";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
                for (Product product : products) {
                    String newLine = String.format("%s,%.2f%n", product.getName(), product.totalValue());
                    bw.write(newLine);
                }
            }
            catch (IOException e) {
                System.out.println("Error ao escrever no arquivo: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
