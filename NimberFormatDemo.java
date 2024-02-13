import java.text.NumberFormat;
import java.util.Locale;

public class NimberFormatDemo {
    public static void main(String[] args) {
        
        int amount = 123456789;
        double xamount = 123456.7891234;

        System.out.println(amount);
        System.out.println(xamount);

    
        Locale usa = new Locale("US");

        NumberFormat nf = NumberFormat.getNumberInstance(usa);
        nf.setMaximumFractionDigits(2);
        
        System.out.println(nf.format(amount));
        System.out.println(nf.format(xamount));


        
             usa = new Locale("fr");

         nf = NumberFormat.getNumberInstance(usa);
        nf.setMaximumFractionDigits(2);
        
        System.out.println(nf.format(amount));
        System.out.println(nf.format(xamount));


        usa = new Locale("in");

        nf = NumberFormat.getNumberInstance(usa);
       nf.setMaximumFractionDigits(2);
       
       System.out.println(nf.format(amount));
       System.out.println(nf.format(xamount));


        
    }
}
