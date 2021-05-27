
package remove;

import java.util.Arrays;


public class Remove {

    
    public static void main(String[] args) {
        int[] Array= {12,56,98,45};
        System.out.println("original array:"+Arrays.toString(Array));
        int removenumber = 1;
        for(int i=removenumber;i<Array.length-1;i++)
        {
            Array[i]=Array[i+1];
        }
        System.out.println("remove element:"+Arrays.toString(Array));
        
    }
    
}
