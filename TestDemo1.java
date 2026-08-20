class Test
{
    int a,b;
    Test(int n1,int n2)
    {
        //Parameterized Constructor
        a=n1;
        b=n2;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}
class TestDemo1
{
    public static void main(String args[])
    {
        Test t1 =new Test(100,45);
    }
}