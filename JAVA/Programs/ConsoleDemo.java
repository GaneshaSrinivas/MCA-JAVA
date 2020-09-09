import java.io.Console;
import java.util.Arrays;
 public class ConsoleDemo {
     public static void main(String[] args) {
         Console console = System.console();

         if (console != null) {
             String username = console.readLine("Username: ");
             char[] password = console.readPassword("Password: ");

             if (username.equals("BMS Admin")
                    && String.valueOf(password).equals("BMSMCA")) {
                console.printf("Welcome to Java Application %1$s.\n",username);
                 Arrays.fill(password, ' ');
            } else {
                console.printf("Invalid username or password.\n");
            }
        } else {
            System.out.println("Console is not available.");
        }
    }
}