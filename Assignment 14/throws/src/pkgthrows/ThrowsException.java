package pkgthrows;

import java.io.*;  

class ThrowsException {

    void method()throws IOException{  
  System.out.println("good");  
 }  
    public static void main(String[] args)throws IOException {
       ThrowsException m=new ThrowsException();  
     m.method();  
  
    System.out.println("bad");    
    }
    
}
