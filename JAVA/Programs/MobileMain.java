

class Mobile
{
int mobid , price;
int model;
void test()
{
MobileInner MI = new MobileInner();
MI.getdata();
MI.display();
}
class MobileInner
{
void getdata()
{
mobid=101;
model=1011;
price=15000;
}
void display()
{
System.out.println(" Mobile id = " +mobid);
System.out.println(" Mobile model = " +model);
System.out.println(" Mobile Price = "+price);
}
}
}
public class MobileMain
{
public static void main(String args[])
{
Mobile mob = new Mobile();
mob.test();
}
}