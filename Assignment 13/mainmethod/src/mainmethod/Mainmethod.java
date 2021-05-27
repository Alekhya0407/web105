
package mainmethod;
class O{
    public int sum(int n1,int n2)
    {
        return n1+n2;
    }
    public int sum(int v1,int v2) //when we keep like this we will get error as output
    {
    return v1-v2;
    }
}
public class Mainmethod{
public static void main(String[] args) {
      O obj1= new O();
       obj1.sum(10,10);
       obj1.sum(20,12);
}
