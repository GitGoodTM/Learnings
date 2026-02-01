import java.io.*;
import java.util.Scanner;

public class FileWriteReadExample {
    public static void main(String[] args) throws IOException {
        // how to create and write on a file

        /* There are mainly 4 options to do this:
        * FileWriter = Good for small or medium-sized text files
        * BufferedWriter = Better performance for large amounts of text
        * PrintWriter = Best for structured data, like reports/logs
        * FileOutputStream = Best for binary files (images, audio, etc.)*/

        // FileWriter writer = new FileWriter("text.txt");
        // we can root this file to our local system
        // if we want this file to be on desktop it can be written as:
        // C:\\Users\\Cho2\\Desktop\\text.txt

        Scanner scanner = new Scanner(System.in);

        //also we can shift the FileWriter to a try/catch clause since it is a dangerous operation
        try(FileWriter writer = new FileWriter("text.txt")){
            System.out.print("Enter the text to be written: ");
            writer.write(scanner.nextLine());
            System.out.println("File has been written");
        }catch (IOException e){
            System.out.println("File writing failed");
        }

        // Let's check out how to read a file

        /* There are mainly 3 options to do this:
        * BufferedReader + FileReader : Best for reading text files line-by-line
        * FileInputStream: Best for binary files (images, audio,etc.)
        * RandomAccessFile: Best for read/write specific portions of a large file*/

        String filePath = "text.txt"; // again, it could be C:\\Users\\Cho2\\Desktop\\text.txt

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("File exists");
        }catch (FileNotFoundException e){
            System.out.println("Failed to locate the file");
        }catch (IOException e){
            System.out.println("Something went wronf=g");
        }
    }
}
