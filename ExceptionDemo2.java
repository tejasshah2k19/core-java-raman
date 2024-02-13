class ExceptionDemo2{
    public static void main(String[] args) {
        
        try{ 
        int a = 10;
        int b = 0;
        int c = a/b; 
        }catch(Exception e){
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }

    }
}