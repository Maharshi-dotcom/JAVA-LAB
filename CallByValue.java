public class CallByValue
{
    public static void main(String[]args)
    {
        int num=10;
        System.out.println("Befor calling method:"+num);
        modifyvalue(num);
        System.out.println("After calling method:"+num);
    }
    public static void modifyvalue(int value)
    {
        value=20;
        System.out.println("value inside method:"+value);
    }
}