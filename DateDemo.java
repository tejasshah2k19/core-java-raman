import java.util.Date;

public class DateDemo {
    
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getDate());
        System.out.println(d.getDay());//sunday-0 , monday-1
        System.out.println(d.getMonth());//0-jan 1-feb  
        System.out.println(d.getTime());//current milisecond 
        //1st jan 1 1970 

        //deprecated -> 
    }
}
