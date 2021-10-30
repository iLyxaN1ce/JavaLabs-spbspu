package main.homeTasks.lab2;

import main.homeTasks.lab2.Exceptions.DivideNullException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<String> list = readUsingFiles("/home/ilyait/JavaProjects/Global/JavaLabs-spbspu/src/main/homeTasks/lab2/temp.txt");
            int N = Integer.valueOf(list.get(0));

            Matrix matrix = new Matrix(N);
            matrix.printMatrix("output.txt");
            for (int i = 0; i < 3; i++) {
                matrix.rotateAndDivideMatrix();
                matrix.printMatrix("output.txt");
            }
        } catch (DivideNullException | IOException err) {
            System.err.println("чё то не так");
        }
    }

    private static List<String> readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        return allLines;
    }
}
