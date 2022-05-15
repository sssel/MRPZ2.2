import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введіть місце розташування файла");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String search = "public";
        String replace = "private";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        System.out.println("Вміст файлу до редагування");
        print(fileName);
        Files.write(path,
                new String(Files.readAllBytes(path), charset).replace(search, replace)
                        .getBytes(charset));
        System.out.println("Вміст файлу після редагування");
        print(fileName);
    }
    public static void print(String path) throws IOException {
        File f = new File(path);
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}