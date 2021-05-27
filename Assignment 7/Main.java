class Num{

	public void real(){
		System.out.println("Real Numbers");
	}
	public void imag(){
		System.out.println("Imanginary Numbers");
	}
	public void mathe(){
		System.out.println("Numbers");
	}
}
class Real extends Num{

	public void ration(){
		System.out.println("Rational Numbers");
	}
	public void irration(){
		System.out.println("Irrational Numbers");
	}
	public void mathe(){
		System.out.println("Real Numbers");
	}
}
class Rational extends Real{
	
	public void inte(){
		System.out.println("Integers Numbers");
	}
	public void whole(){
		System.out.println("Whole Numbers");
	}
	public void mathe(){
		System.out.println("Rational Numbers");
	}
}
public class Main{
	
	public static void main(String[] args){
		Num a=new Num();
		Real b=new Real();
		Rational c=new Rational();
		a.real();
		a.imag();
		System.out.println("\n");
		b.ration();
		b.irration();
		System.out.println("\n");
		c.inte();
		c.whole();

		System.out.println("\nOverridden");
		b.mathe();
		c.mathe();

		Num d=new Real();
		Real e=new Rational();
		System.out.println("\nRuntime Polymorphism");
		d.mathe();
		e.mathe();

	}
}