
package overloading;
class Add{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}


public class Overloading {

    
    public static void main(String[] args) {
       System.out.println(Add.add(33,33));  
System.out.println(Add.add(33,33,33));  
    }
    
}
