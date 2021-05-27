
package stringcases;


public class Stringcases {

    
    public static void main(String[] args) {
       String str="alekhya is good girl";
       System.out.println(str.startsWith("alekhya"));
       System.out.println(str.endsWith("girl"));      
       String str1= " this ";
       System.out.println(str.substring(0, 4).equalsIgnoreCase("this"));
       String str3 = "god";
       String str4 = "god";
       if(str3.compareTo(str4) == 0){
      System.out.println("str1 is equal to str3");
    }else{
      System.out.println("str1 is not equal to str3");
    }
           
    }
    
}
