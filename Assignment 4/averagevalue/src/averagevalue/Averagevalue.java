
package averagevalue;

public class Averagevalue {

   
    public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4};
		int length = array.length;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		int average = sum / length;
		
		System.out.println("Average of array : "+average);
    }
    
}
