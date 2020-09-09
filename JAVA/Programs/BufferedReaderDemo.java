import java.io.*;

public class BufferedReaderDemo {
public static void main(String[] args) {
try {
BufferedReader br = new BufferedReader(new FileReader("BMS1.txt"));
String bms;

while ((bms = br.readLine()) != null) {
System.out.println(bms);
}
} catch (IOException e) {
}
}
}