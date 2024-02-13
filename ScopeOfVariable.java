public class ScopeOfVariable {
    
    static int s; //static  ----- class -> memory--> onetime 
    int i; //instance  ------- object -> memory  --> nTime 

    void add(){
        int j; //local 
        for(;;){
            int k;  //local -- block 
        }
        //k is not accessible 
    }

    void sub(){

    }

}


 