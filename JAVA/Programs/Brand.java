class Phone{
     int m_price=10000;
       void display(){
          Vivo b=new Vivo();
           b.show();
           }
           }
      class Vivo extends Phone{
           void show(){
           System.out.println("It is Vivo phone");
           System.out.println("The Price is "+m_price);
           }
           }
       class Iphone extends Phone{
		   int M_price=50000;
	              void show(){
	              System.out.println("It is Iphone");
	              System.out.println("The Price is "+M_price);
	              }
           }
   public class Brand{
   public static void main(String args[]){
     	Phone p=new Phone();
     	p.display();
     	Iphone i=new Iphone();
     	i.show();
     	}
     	}