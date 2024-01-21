public class InheritanceDemo {
    
    public static void main(String[] args) {
        Child c = new Child();
        c.sub();
        c.add();
    }
}

class Parent{
    void add(){
        System.out.println("Parent::add()");
    }
}

class Child extends Parent{

    void sub(){
        System.out.println("Child::sub()");
    }
}
