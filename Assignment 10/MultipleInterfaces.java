interface I1 {
  abstract void method();
}
 
interface I2 {
  abstract void method();
}
 
public class MultipleInterfaces implements I1, I2 {
 
  @Override
  public void method() {
    System.out.println("hello world");
  }
 
  public static void main(String[] a) {
    MultipleInterfaces mi = new MultipleInterfaces();
    I1 i1 = new MultipleInterfaces();
    I2 i2 = new MultipleInterfaces();
    i1.method();
    i2.method();
  }
 
}