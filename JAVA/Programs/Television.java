import java.util.Scanner;
public class Television{
boolean status;
int channel,volume;
Scanner sc1=new Scanner(System.in);
Television(int c,int v,boolean s){
	channel=c;
	volume=v;
	status=s;
	}
	public void channel()
	{   if(status==true){
		System.out.println("Enter Channel number to Change ");
		channel=sc1.nextInt();
		System.out.println("The Channel number is "+channel);
	}else System.out.println("TV is OFF ");
	}
		public void volume()
		{  if(status==true){
			char c;
			int vol;
			System.out.println("Default Volume is "+volume);
			System.out.println("Do you want to change Volume Increase(I) and Decrease(D) ");
			c=sc1.next().charAt(0);
			if(c=='I'){
				System.out.println("Enter how much to icrease : ");
				vol=sc1.nextInt();
				volume+=vol;
			System.out.println("Current Volume is "+volume);
		}
		else if(c=='D'){
				System.out.println("Enter how much to Decrease : ");
				vol=sc1.nextInt();
				volume-=vol;
			System.out.println("Current Volume is "+volume);
		}
		else{
			System.out.println("Enter proper input");
			return;
		}
		}else System.out.println("TV is OFF ");
     }

		public void offstatus(){
				status=false;
				System.out.println("TV is OFF ");
		}
		public void onstatus(){
					status=true;
					System.out.println("TV is ON ");
		}

public static void main(String[] args ){
		char ch;
		Television t=new Television(10,15,false);
	do{
		boolean st=true;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("1.ONN\n2.Change Channel\n3.Change Volume\n4.OFF");;
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		switch(c)
		{
		 case 1:t.onstatus();
		 		break;
		case 2: t.channel();
				break;
		case 3:t.volume();
				break;
		case 4:t.offstatus();
				break;
		default:System.out.println("Invalid Choice");
		}
			System.out.println("Do you want to continue(Y/N)");
			ch=sc1.next().charAt(0);
	}while(ch=='y' || ch=='Y');
	}
}



