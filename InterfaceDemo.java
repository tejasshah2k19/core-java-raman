public class InterfaceDemo{

    public static void main(String[] args) {
        
    }
}

interface GOI{
    void interest();
}

interface RBI extends GOI{
    public static final int MAX = 10;

    void wid();
    public abstract void deposit();
}


abstract class ICICI implements RBI{

}

class SBI implements RBI{
    public void wid(){

    }
    public void deposit(){

    }
    public void interest(){
        
    }
}

