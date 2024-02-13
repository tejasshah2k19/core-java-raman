public class GmailLogin {
    public static void main(String[] args) {
        Google.authenticate("xx", "Xxx");
    }
}
class Google{
    //authenticate -> email and password 
    //if email is admin@gmail.com and password is admin 
    //then authenticate reutrn true otherwise  throw GmailException  

    //authenticate method also use validateEmail method that 
    //verify the format of email if email format
    //is invalid throw  GmailException 
     public static boolean authenticate(String email,String password){
        // throw new GmailException("Invalid Credentials");
        // throw new GmailException("Invalid Email Format");
        
        if(validateEmail(email) == false){
            throw new GmailException("Invalid Email Format");
        }
        else if(email.equals("admin@gmail.com") && password.equals("admin")){
            return true;
        }else{
            throw new GmailException("Invalid Credentials");
        }
        
      }  

      private static boolean validateEmail(String email){


        return email.matches("[a-zA-Z0-9]+@gmail.com"); 
      }
}

class GmailException extends RuntimeException{
    GmailException(String msg){
        super(msg);
    }
}
