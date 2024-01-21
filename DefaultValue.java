public class DefaultValue {
    byte b ;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bb; 

    void display(){
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bb);
    }
    public static void main(String[] args) {
        DefaultValue dd = new DefaultValue(); 
        dd.display();
    }   
}
