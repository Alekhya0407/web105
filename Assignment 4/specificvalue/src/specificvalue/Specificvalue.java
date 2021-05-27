package specificvalue;


public class Specificvalue {

   
    public static void main(String[] args) {
        int[] num={3,4,6,9};
        int toFind = 4;
        boolean found= false;
        for (int n : num){
        if (n == toFind) {
        found = true;
        break;
      }
    }
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
    }
        
    }
