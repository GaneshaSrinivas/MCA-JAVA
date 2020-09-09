import java.io.*;

public class FileWriteBufferedWriter {
public static void main(String[] args) {
try {
BufferedWriter out = new BufferedWriter(new FileWriter("BMS1.txt"));
out.write("Welcome to BMS MCA Java Class");
out.close();

System.out.println("File created successfully");
} catch (IOException e) {
}
}
}