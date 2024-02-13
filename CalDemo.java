import java.util.Date;
import java.util.Calendar;

public class CalDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //cal is an abstract class  
        System.out.println(c);

        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.YEAR));

        // c.add(Calendar.DATE, 50);
        c.roll(Calendar.DATE, 50);
        
        Date d = c.getTime(); 

        System.out.println(d);



        
    }
}
