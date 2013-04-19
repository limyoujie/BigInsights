import java.io.*;
public class IncDate extends Date
{
    public IncDate (int newMonth, int newDay, int newYear)
    {
	super(newMonth,newDay,newYear);
    }

    public void increment()
    {
	day=day+1;
    }
    public static void main(String args [])	
    {
	IncDate newdate = new IncDate(3,28,1986);
	System.out.println(newdate.toString());
	newdate.increment();
	System.out.println(newdate.toString());
    }

}


