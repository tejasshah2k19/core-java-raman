public class ConstructorDemo {


    public static void main(String[] args) {
        User u = new User();
        u.display(); 

        User u2 = new User("balaram",23);
        u2.display();
    }
}
class User{
    
    String name;//null
    int age; 

    User(){
        name = "laxman";
        age = 12; 
    }

    User(String n,int age){
        this.name = n;
        this.age = age; 
    }
    void display(){
        System.out.println(name+" : "+age);
    }
}