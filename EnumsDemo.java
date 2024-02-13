public class EnumsDemo {
    static SIZE x = SIZE.SMALL;        
       
    public static void main(String[] args) {
        System.out.println(x.BIG.val);
        System.out.println(x.val);
        System.out.println(SIZE.BIG);
    }
}


enum SIZE{
    BIG(10),SMALL(5),EXLARGE(20);
    int val; 
    SIZE(int v){
        this.val = v;
    }

}