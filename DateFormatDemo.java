import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateFormatDemo {
    
    public static void main(String[] args) {
        
        Date today = new Date(); //today 
       
        DateFormat df = DateFormat.getInstance(); //default 
        System.out.println(df.format(today));//13/02/24, 1:22 pm

        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(today)); //13/02/24

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(today));//13-Feb-2024 

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(today)); //13 February 2024

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(today)); //Tuesday, 13 February, 2024
        
        Locale loc1 = new Locale("hi", "in");
        df = DateFormat.getDateInstance(DateFormat.FULL,loc1);
        System.out.println(df.format(today)); //Tuesday, 13 February, 2024
       
        
        loc1 = new Locale("ja");
        df = DateFormat.getDateInstance(DateFormat.FULL,loc1);
        System.out.println(df.format(today)); //Tuesday, 13 February, 2024
       

		loc1 = new Locale("fr"); //lang 
		df = DateFormat.getDateInstance(DateFormat.FULL, loc1);
		System.out.println(df.format(today)); // Tuesday, 13 February, 2024
		

    }
}
