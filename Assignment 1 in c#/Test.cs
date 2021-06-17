using System;  
    public class Program  
    {  
	   int id;
	   String name;
	   public void method(int i, String n){
		   id=i;
		   name=n;
	   }
	   public void display(){
		   Console.WriteLine(id+ " "+name);
	   }
	public class Test{
		   
	   
        public static void Main(string[] args)  
        {  
            Console.WriteLine("Hello World!");
            Program  p = new Program();
            p.id=12;
            p.name="alekhya";
            Console.WriteLine(p.id);
            Console.WriteLine(p.name);
            Program p1=new Program();	
            p1.method(103,"akhi");
            p1.display();			
        }  
    }
	}	