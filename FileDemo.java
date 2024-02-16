import java.io.File;
import java.io.IOException; 

public class FileDemo {
    public static void main(String[] args) throws IOException{
        //File class is only responsible for file operation 

        //new delete exists? rename -> 


        File f =new File("demo.txt"); 
        f.createNewFile(); //IOException - try catch - throws  
           //create new file 
           //file is already exists ? then it will not create 
           //return type of createNewFile is boolean , 
           //if file is created return true other wise return false   

        File t = new File("c:\\java\\demo.txt");
        t.createNewFile(); 

        File x = new File("c:\\java\\","demo.txt"); // path,filename 
        x.createNewFile(); 


        File y = new File("c:\\java\\tmp");
        y.mkdir(); //you can't say createNewFile() 

        File yd = new File(y,"a.pdf");
        yd.createNewFile();

        //File(String)
        //File(String,String)
        //File(File,String)


        //how to check file is already present or not 
        //how to check folder is already present or not 
        
        File k = new File("demo.txt");
        File kd  = new File("demo");

        System.out.println(k.exists());//exits will return true if it is present 
        System.out.println(kd.exists());//exits will return true if it is present 
        
        //how to check size of a file / folder 

        System.out.println(k.length()); //return bytes 
        System.err.println(kd.length());

        //how to check given path is file or directory? 
        System.out.println(k.isFile());
        System.out.println(k.isDirectory());

        //how to get all the files and folders of a given directory 
        File java = new File("c:\\java");
        String allData [] = java.list(); 

        k.isHidden(); //boolean 

        k.canRead();//boolean 
        k.canWrite(); //boolean 


        //rename file 
        File pk  = new File("c:\\java\\pk.txt"); 
        File abcd = new File("c:\\java\\newPk.txt");
        pk.renameTo(abcd); 


        pk.delete(); 
        //same for directory - but rule is folder must be empty then only you can delete 

        




    }
}
