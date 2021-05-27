package minmaxvalues;


public class Minmaxvalues {

    
  
    public static void main(String[] args) {
      int[] arrNumber = new int[]{100,200,300};
      int maximum = maxNumber(arrNumber);
      System.out.println("Maximum value : " + maximum);
      
      int minimum = minNumber(arrNumber);
      System.out.println("Minimum value : " + minimum);
   }
 
   public static int maxNumber(int[] arr)
   {
      int maximumValue = arr[0];
      for(int a = 1; a < arr.length; a++)
      {
         if(arr[a] > maximumValue)
         {
            maximumValue = arr[a];
         }
      }
      return maximumValue;
   }
 
   public static int minNumber(int[] arr)
   {
      int minimumValue = arr[0];
    
      for(int a = 1; a < arr.length; a++)
      {
         if(arr[a] < minimumValue)
         {
            minimumValue = arr[a];
         }
      }
      return minimumValue;
   }
}
