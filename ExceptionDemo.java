import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        
        //error can be categoried in two category 
        //1) compile time -- detected by compiler -> no .class ->  
        //2) run time -- size 6 -> 7th index , negative index, null object , / by zero 
            //exception -> 
                // JRE -> generate exception{class} -> throw that exception{obj} => program crash 
            // class -> exception 

            // array -> index , negative , out of the range -> ArrayIndexOutofBoundException** 
            // 10/ 0 -> ArithmeticException 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try{ 
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ans = a/b;
            System.out.println(ans);       
        }catch(ArithmeticException e){
            System.out.println("Please do not enter zero...");
        }catch(InputMismatchException e){
            System.out.println("please enter only whole numbers");
        }catch(Exception e){
            System.out.println("SMW PTA !! ");
            //sendMailToDev(e); 
        }
        // int a[] = new int[3];
        // System.out.println(a[3]);//0 1 2 


        // String s = null;
        // s.length(); 


        //no 
        //1) checked exception --> you must have to handle exception -- compiler will force  
        //2) unchecked exception --> you can ignore it -- no force 

        //create file -> IOException => checked exception 
        //ArithmeticException -> 


        //try - catch -- finally 


        //try with autoresource collection 

        //Scanner x = new Scanner(System.in);
        //x.close();

        try(
            Scanner  x = new Scanner(System.in); 
            // String s  = new String("S");
        ){
            //no catch block still it works 
        }//x.close(); 

        

        try{
            //someconde 
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            //
        }
    }

}
