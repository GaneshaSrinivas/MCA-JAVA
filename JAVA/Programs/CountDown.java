import java.util.Scanner;


public class CountDown{
			public static void countdown(int n) {
	    	if (n == 0) {
	        System.out.println("0");
	        System.out.println("Recursive Method Executed Successfully!!!!");
	    	} else {
	        System.out.println(n);
	        countdown(n - 1);
	    	}
		}
 public static void main(String args[]){
		  	char a;
		  	Scanner SC=new Scanner(System.in);
			do{
        	int n;
        	System.out.println("Enter a number :");
        	n=SC.nextInt();
         	System.out.println("Count Down!!! :");
        	countdown(n);
          	System.out.println("Do you want to continue(Y/N)");
		    a=SC.next().charAt(0);
			}while(a=='Y' || a=='y');

        	}
        }
