
package callconstructor;

public class Callconstructor {
     int a;
     int b;
     Callconstructor(int a,int b){
         this.a=a;
         this.b=b;
     }
     void display(){
         System.out.println("a = " + a + "  b = " + b);
     }
    
    public static void main(String[] args) {
        Callconstructor ob=new Callconstructor(10,20);
        ob.display();
       
    }
    
}
