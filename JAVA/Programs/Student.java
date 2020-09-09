import java.util.Scanner;

class Result{
		      String name,addr;
	          int id, java, ml, cn,total;
	          float perc;

		      public void accept(){
	          Scanner SC=new Scanner(System.in);
	          System.out.print("Enter Name: ");
	          name=SC.nextLine();
	          System.out.print("Enter Roll Number: ");
	          id=SC.nextInt();
			  System.out.print("Enter Address: ");
	          addr=SC.next();
	          System.out.print("Enter marks in Java: ");
	          java=SC.nextInt();
	          System.out.print("Enter marks in Machine Learning: ");
	          ml=SC.nextInt();
	          System.out.print("Enter marks in Computer Networks: ");
              cn=SC.nextInt();
		      }

            	 public void cal(){
	       		 int total=java+ml+cn;
            	 float perc=(float)total/300*100;
					}

				public void dis(){
		        System.out.println("Roll Number: "+ id +"\nName: "+name+"\nAddress: "+addr);
		        System.out.println("Java: " +java+"\nMachine Learning: "+ml+"Computre Networks: "+cn);
                System.out.println("Total: "+total +"\nPercentage: "+perc);
         }
}

public class Student
{
      public static void main(String args[])
      {
		   char a;
	       Scanner SC=new Scanner(System.in);
		   Result r=new Result();
		   do{
			r.accept();
			r.cal();
			r.dis();
          System.out.println("Do you want to continue(Y/N)");
          a=SC.next().charAt(0);
	      }while(a=='Y' || a=='y');

      }

}



