package main.homeTasks.lab2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        byte[] temp = readFile("/home/ilyait/JavaProjects/Global/JavaLabs-spbspu/src/main/homeTasks/lab2/temp.txt");
        int N = temp[0];
        System.out.println(N);
//        try {
//            Matrix matrix = new Matrix(N);
//            matrix.printMatrix("output.txt");
//            for (int i = 0; i < 3; i++) {
//                matrix.rotateAndDivideMatrix();
//                matrix.printMatrix("output.txt");
//            }
//        } catch (DivideNullException | IOException err) {
//            err.printStackTrace();
//        }
    }

    private static byte[] readFile(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)){
            return fileInputStream.readNBytes(1);
        }catch (IOException err){
            err.printStackTrace();
            return null;
        }
    }
    private static List<String> readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        return allLines;
    }
}
