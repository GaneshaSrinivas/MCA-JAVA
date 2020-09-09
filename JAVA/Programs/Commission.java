import java.util.Scanner;

public class Commission
{
      public static void main(String args[])
      {
          String aname;
          double amt,comm;
          for(int i=1;i<=5;i++){
          Scanner SC=new Scanner(System.in);
          System.out.print("\nEnter Sales man Name "+i+": ");
          aname=SC.nextLine();
          System.out.print("\nEnter ammount ");
          amt=SC.nextDouble();
          if(amt>0 && amt<=10000)
          {
		  comm = amt * 0.05 ;
		  System.out.println("Commision = " +comm);
		  }
          else if(amt>10001 && amt<=15000)
          {
          comm = amt * 0.08;
          System.out.println("Commision = " +comm );
          }
          else if(amt>15001 && amt<=20000)
	      {
	      comm = amt * 0.10;
	      System.out.println(" Commision = " +comm );
	      }
          else if(amt>20001 && amt<=30000)
	      {
	      comm = amt * 0.25;
	      System.out.println(" Commision = " +comm );
	      }
          else if(amt>30000)
	      {
	      comm = amt * 0.30;
	      System.out.println(" Commision = " +comm );
	      }
	     }
       }

 }