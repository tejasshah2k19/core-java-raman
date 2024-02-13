public class StringDemo {
    public static void main(String[] args) {
        
        String s1 = "rock";//['r','o','c','k']
        String s2 = "rock";//['r','o','c','k']

        System.out.println(s1);//rock 
        System.out.println(s2);//rock 

        System.out.println(s1 == s2); //reference 

        String s3 = new String("rock"); 

        System.out.println(s1 == s3);

        //value 
        //equals
        //equalsIgnoreCase
        //compareTo
        //compareToIgnoreCase 

        System.out.println(s1.equals(s3)); //true 
        String s4 = "Rock"; //R 
        System.out.println(s1.equals(s4)); //false  
        
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s4)); //true 
        
        //comareTo ->ASCII 
        //same => 0 
        //s1 = rock 
        //s2 = lock
        // 114 - 108 =>6   
        //s1-s2 = 0 
       
         //comareToIgnoreCase ->ASCII 
        

         String name = "jackSon";

         System.out.println(name.toUpperCase()); // JACKSON

         System.out.println(name); // jackSon 
        
         name = name.toUpperCase(); 

         System.out.println(name); // JACKSON
         
         
         //extract individual character from string 

         //name = "royal";    //charAt 
        //0:r 1:o 2:y 3:a 4:l 
        System.out.println(name.charAt(0));
        
        System.out.println("All Characters------>");
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String title = "hey this is java string example"; 

        title.substring(9);//9 to end {is java string example} 

        title.substring(9,14); //9 10 11 12 13 
        //first : inclusive 
        //second : exclusive 

        String joke ="jony jony yes papa";
        //how many words
        //print single word from it ? 


        String x[] = joke.split(" ");

        //loop -> x jony   jony    yes  papa 



        //take a string from user and find vowel -> a e i o u ->
        //take a string from user and check how many words are palindrome in it 
        //convert string in toggle -> 
            //input ->  jaiHinD -> JAIhINd
        //selftest 3 and 4 

    }
}
