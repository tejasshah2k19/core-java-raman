import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo{

    public static void main(String[] args) {
        

        String data = "7gh65i49er8g7h6"; 
                      //0 3 4 6 7 10 12 14 
        //pattern matcher 


        // Pattern p = Pattern.compile("[0-9]+");//regex what data you want to search or match 

        Pattern p = Pattern.compile("\\d+");//regex what data you want to search or match 

        Matcher m = p.matcher(data); //matcher you can match 

        // System.out.println(m.find());//true -> bcz 0-9 is present in data 

        // System.out.println(m.start());
        // m.find(); 
        // System.out.println(m.start());
        // m.find();
        // System.out.println(m.start());
        // m.find(); 
        // System.out.println(m.start());

        while(m.find()){
            System.out.println(m.start()+" "+m.group());
        }
    
        int i1 = -123;
        int i2 = 12345;
        System.out.printf("%d",i1);
        
        System.out.printf("%d %d",i1,i2);

        System.out.printf("%2$7d %1$d",i1,i2);//123___X

        
        System.out.printf(">%1$(7d< \n", i1);


        System.out.println("\n");

        System.out.printf(">%(7d<",123);
        
        System.out.println("\n");

        System.out.printf(">%(7d<",-123);

    }
}