class Test
{
    int a;
    int b;
 
    Test()
    { 
        this(20,30);
        System.out.println("Inside  default constructor \n");
    }
     
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
 
    public static void main(String[] args)
    {
        Test object = new Test();
    }
}