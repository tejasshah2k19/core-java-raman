import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SimpleDateFormatDemo{

    public static void main(String[] args) throws ParseException{
        

        Scanner scr= new Scanner(System.in);
        String datePattern = "MM-dd-yyyy";

        System.out.println("Enter Date(MM-dd-yyyy)");
        String strDate = scr.next();

        SimpleDateFormat sd1  = new SimpleDateFormat(datePattern);

        Date date1 =  sd1.parse(strDate);
        System.out.println(date1);


        datePattern = "dd-MM-yyyy";

        System.out.println("Enter Date : (dd-MM-yyyy) ");
        strDate = scr.next();

         sd1  = new SimpleDateFormat(datePattern);

        date1 =  sd1.parse(strDate);
        System.out.println(date1);


    }
}