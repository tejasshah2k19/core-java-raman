public class AssertDemo{
    public static void main(String[] args) {
        MyCalc m = new MyCalc();
        //assert(m.add(20, 20) == 50); //assert -> false 
        assert(m.add(20, 20) == 50):"AssertDemo:main()"; //assert -> false 
        
    }
}

class MyCalc{


    int add(int a,int b){
        return a+b;
    }

    int max(int a,int b){
        if(a>b)
            return a;
        else 
            return b;
    }
}