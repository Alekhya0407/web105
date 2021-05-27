
package pkgsuper;
class Gender {
   
    // Creating method m1 for class Programming
    public void m1()
    {
      System.out.println("She is nice");
    }
}
class BOY extends Gender {
   
    // Creating method m2 for class DP
    public void m2()
    {
      System.out.println("he is boy");
    }
}

public class Super {

   
    public static void main(String[] args) {
        BOY obj = new BOY();
        obj.m2();
        obj.m1();
    }
    
}
