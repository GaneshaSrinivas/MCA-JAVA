import java.io.*;
 public class FileOutStreamDemo {
public static void main(String[ ] args) {

FileOutputStream out; // declare a file output object
PrintStream p; // declare a print stream object

try {
	// Create a new file output stream,connected to "File.txt"
	out = new FileOutputStream("File.txt");
	// Connect print stream to the output stream
	p = new PrintStream(out);
	p.println("The text shown here will write to a file after run");
	System.out.println("The Text is written to File.txt");
	p.close();
	}
	catch (Exception e) {
	System.err.println("Error writing to file");
	}
	}
	}