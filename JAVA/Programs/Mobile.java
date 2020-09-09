//By creating a class called mobile, define n inner class with various features of a mobile.

class Phone{
     int m_price=10000;
     void display(){
          Model b=new Model();
           b.show();
           }
           class Model{
           void show(){
           System.out.println("It is basic phone");
           System.out.println("The Price is "+m_price);
           }
           }
	   }
   public class Mobile{
   public static void main(String args[]){
     	Phone p=new Phone();
     	p.display();
     	}
     	}