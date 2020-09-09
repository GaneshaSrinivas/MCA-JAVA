class Person{

private String name;
private String dob;

          Person(String str1,String str2)
          {
          name=str1;
          dob=str2;
          }
        void display()
          {
System.out.println("Person name= "+name);
            System.out.println("Person  dob= "+dob);

          }
         }

        class CollegeGraduate extends Person{

         private double gpa;
         private int yog;

         CollegeGraduate(String s1,String s2,double p,int q)
         {
         super(s1,s2);
         gpa=p;
         yog=q;
         }
     public void display()
             {
            super.display();
             System.out.println("GPA= "+gpa);
    System.out.println("Year of Graduation= "+yog);

             }
             }
             public class Prog3{

             public static void main(String args[])
             {
             CollegeGraduate c = new CollegeGraduate("Ganesha S ","27-09-1997",8.8,2021);
             c.display();
             }
             }

