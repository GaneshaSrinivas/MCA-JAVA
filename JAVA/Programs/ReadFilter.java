import java.io.*;
class ReadFilter
{
  public static void main(String args[])
  {
  try
  {
  FileInputStream fin = new FileInputStream("myFile.txt");
  BufferedInputStream bis = new BufferedInputStream(fin);
  // Now read the buffered stream.
  while (bis.available() > 0)
  {
  System.out.print((char)bis.read());
  }
  }
  catch (Exception e)
  {
  System.err.println("Error reading file: " + e);
  }	 }	}