import java.io.*;
public class Date
{
    protected int year;
    protected int month;
    protected int day;
    protected static final int MINYEAR=1583;

    public Date(int newMonth, int newDay, int newYear)
    { 
	month =newMonth;
	day = newDay;
	year = newYear;
    }
    public String toString()
    {
	String monthString=null;
	switch (month){
	    case 1: monthString="January";
	    case 2: monthString="February";
	    case 3: monthString="March";
	    // Need to add the cases for the rest of the months too
	}
	return (monthString + " " + day +", "+year);
    }
    
    public int yearIs()
    {
	return year;
    }
    public int monthIs()
    {
	return month;
    }

    public int dayIs()
    {
	return day;
    }
    /*
    public static void main (String [] args)
    {
	Date birthday = new Date (3, 28,1986);
	System.out.println("Year is " + birthday.yearIs());
	System.out.println("Month is " + birthday.monthIs());
	System.out.println("Day is " + birthday.dayIs());
	System.out.println(birthday.toString());
    }    
    */
}
