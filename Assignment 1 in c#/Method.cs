using System;
public class Method{
		String name="akhi";
    public void m1(){
		Console.Write("enter name:");
		name=Console.ReadLine();
	}
	public void display(){
		Console.Write("Name\t"+name);
	}
     static void Main(String[] args)
	  {
		  Method mn=new Method();
	    mn.m1();
		mn.display();
		Console.ReadLine();
		}
	}
	  