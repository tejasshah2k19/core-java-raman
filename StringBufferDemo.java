public class StringBufferDemo{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("rock"); //String 

        StringBuffer sb1  = new StringBuffer(); // no argument

        StringBuffer sb2 = new StringBuffer(100);//int - capacity 

        sb.append("Sparrow");

        System.out.println(sb); //rockSparrow 

        sb.insert(4," ");//rock Sparrow 

        System.out.println(sb); //rock Sparrow 

        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.length());
        System.out.println(s1.capacity());

        s1.append("123456789123456789"); //4

        System.out.println(s1.length());
        System.out.println(s1.capacity());//34 

        s1.append("12345678912345678");

        System.out.println(s1.length());
        System.out.println(s1.capacity());//34 

        //16 

        //newCapacity = (old*2)+2

        //34

        StringBuffer sb2s = new StringBuffer("Malhar");
        sb2.replace(0, 1, "MALHAR");

        System.out.println(sb2);
    
        sb2.delete(0, 2);//0 1 

        sb.reverse(); 


        String str = sb.toString();  
        
        // sb = new StringBuffer(str);
        sb.append(str); 
        // act("s"); //compilation error 
    }
    static void act(StringBuffer s){

    }

}

