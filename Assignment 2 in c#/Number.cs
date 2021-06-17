using System;
public class Number
{
   public static void Main(String[] args)
   {
      Console.WriteLine("Enter size of the array :");
		int size = int.Parse(Console.ReadLine());
		
		int[] arr = new int[size];
		
		for(int i =0 ; i<size; i++){
			Console.WriteLine("Enter value for index "+i+" : ");
			arr[i] = int.Parse(Console.ReadLine());
		}
		
		int larger = arr[0];
		int smaller = arr[0];
		for(int i=1; i<size; i++){
			if(arr[i] > larger){
				larger = arr[i];
			}
			if(arr[i] < smaller){
				smaller = arr[i];
			}
		}
		
		Console.WriteLine("Smaller value : "+smaller+", and larger value : "+larger);
		}
}