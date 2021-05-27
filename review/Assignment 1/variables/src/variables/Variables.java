package variables;

public class Variables {
     public void GirlAge() {
      int age = 0;
      age = age + 3;
      System.out.println("Girl age is : " + age);
   }
     private static double height ;
     public static final String NAME = "Santhi";
    public static void main(String[] args) {
        height = 61.4 ;
        System.out.println(NAME +"Height is:" +height);
       Variables p = new Variables();
         p.GirlAge();
       
    }
    //Static variables can be used as an alternate solution for global variables.
}
