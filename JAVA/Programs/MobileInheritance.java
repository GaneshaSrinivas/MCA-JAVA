class MobileSuper
{
MobileSuper(int id , int model , int price)
{
int mobid = id;

int mobmodel = model;
int mobprice = price;
}
void showSuper()
{
System.out.println(" Mobile id = " +mobid);

System.out.println(" Mobile model = " +mobmodel);
System.out.println(" Mobile price = " +mobprice);
}
}
class MobileBase extends MobileSuper
{
int ram = 5;

void showbase()
{

System.out.println(" Mobile id = " +mobid);

System.out.println(" Mobile model = " +mobmodel);
System.out.println(" Mobile price = " +mobprice);


System.out.println(" Mobile ram =" +mobram);

}
}

public class MobileInheritance
{
public static void main(String args[])
{
MobileSuper Mob = new MobileSuper(1,1001,10000);
mob.showSuper();
MobileBase Mobbase = new MobileBase();
Mobbase.showbase();
}
}