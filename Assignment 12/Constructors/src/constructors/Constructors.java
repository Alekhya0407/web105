
package constructors;


public class Constructors {
     int id;
     String name;
     void disp(){
         System.out.println(id+""+name);
     }
   
    public static void main(String[] args) {
       Constructors o1=new Constructors();
       Constructors o2=new Constructors();
       o1.disp();
       o2.disp();
    }
    
}
