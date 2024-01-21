public class First{

    void printMsg(){
        System.out.println("printMsg()");
    }

    public static void main(String args[]){
        System.out.println("My First Java File");
        First obj; //delcare 
        obj = new First();
        
        First obj2 = new First(); 
        //using dot operator 

        obj.printMsg();
        obj2.printMsg();
    }
}
 

class Second{
 
}

class Third {

}