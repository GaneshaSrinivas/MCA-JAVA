public class Phone{
public static void main(String args[]){
SmartPhone s=new SmartPhone();
s.show();
}
}
class Basic{
int price=500;
void show(){
System.out.println("Basic phone");
System.out.println("Price = "+price);
}
}
class SmartPhone extends Basic{
void show(){
System.out.println("Smart Phone");
System.out.println("Price = "+price);
}
}
