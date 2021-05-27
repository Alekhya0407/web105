
package variables;


public class Variables {
    static int i=10;
    static String j="akhi";

     static void disp(){
         System.out.println("i value is : " +i);
         System.out.println("j value is : " +j);
     }
     String name="ali";
    private int g;
     public void g(String name)
     {
         this.name=name;
     }
  
    public static void main(String[] args) {
        disp();
     Variables ob=new Variables();
     ob.g = 5;
     System.out.println("object integer:" +ob.name);
    }
    
}
