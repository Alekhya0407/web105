
package nosuchmethod;


public class Nosuchmethod {
     public void d() {
		System.out.println("anything");
	}
   
    public static void main(String[] args) {
        Nosuchmethod i=new Nosuchmethod();
        i.d();
        i.e(); //nosuchmethod found
    }
    
}
