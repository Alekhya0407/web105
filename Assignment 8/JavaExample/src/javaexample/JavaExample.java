package javaexample;

import java.util.*;  
class JavaExample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
       String pat = null;
      alist.set(0,pat);
      alist.remove("Tim");
      
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(1);
      numbers.add(7);
      numbers.add(5);
      numbers.add(6);
      System.out.println("Number of elements in ArrayList: "+numbers.size());
      
      ArrayList<String> fruits = new ArrayList<>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      Collections.sort(fruits);

      fruits.stream().forEach((str) -> {
          System.out.println(str);
       });
      
       //iterating ArrayList
       alist.stream().forEach((str) -> {
           System.out.println(str);  
       });
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
   }  
}