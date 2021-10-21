package main.homeTasks.lab2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list = readUsingFiles("/home/ilyait/JavaProjects/Global/JavaLabs-spbspu/src/main/homeTasks/lab2/temp.txt");
        int N = Integer.valueOf(list.get(0));

        Matrix matrix = new Matrix(N);
        matrix.printMatrix("output.txt");
        matrix.rotateMatrix();
        matrix.printMatrix("output1.txt");

    }

    private static List<String> readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        return allLines;
    }
}
