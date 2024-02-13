class Chpa4{
    public static void main(String[] args) {
    
        
        int a =10; //decimal 
        int b = 0b111;//binary  
        int c = 012;//octal 
        int d = 0xAB;//hexadecimal 


        int amount = 1_00_000;
        int k = 100000;

        // int j = _102; // underscore will not wokr on first position 

        // float f = 12.2;//error 

        float f = 2.2f;//f F  //by default decimal numbers are double 
        double dd = 2.2D; 


        //casting 

        int a1= 5;
        int b2 = 2;

        float ans =  ((float)a1)/b2;//5/2 = 2.5 => 2 {implicit casting int/int  downcasting}
        System.out.println(ans);

        //float a1 / int a2  -> float 
        //float / int -> float 


        byte bb  = 1;
        byte bbb = 1; 

        // byte ansb = bb + bbb;  // byte + byte => int  -> upcasting 

        //obj = null; 

        System.gc(); 


    }

}