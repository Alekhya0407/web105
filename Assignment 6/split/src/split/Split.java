/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author new
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String s1="akhila is so sweet";  
          String[] words=s1.split("\\s");

             for(String w:words){  
           System.out.println(w);  
    }
    }
}