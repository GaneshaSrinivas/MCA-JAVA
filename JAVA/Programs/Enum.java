// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)
import java.util.Scanner;

// An Enum class
enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class Enum
{
    Day day;

    // Constructor
    public Enum(Day day)
    {
        this.day = day;
    }

    // Prints a line about Day using switch
    public boolean is_workDay()
    {
        switch (day)
        {
        case SATURDAY:
        case SUNDAY:
            return false;

        default:
           return true;

        }
    }

    // Driver method
    public static void main(String[] args)
    {
		boolean st;
        String str = "SATURDAY";
        Enum t1 = new Enum(Day.valueOf(str));
        st=t1.is_workDay();
        if(st==true){
			System.out.println("Its WeekDay");
			}
			else{
				System.out.println("It's Weekoff");}
    }
}