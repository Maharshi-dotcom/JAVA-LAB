import java.util.Scanner;
class Input2
{
    public static void main(String[]args)
    {
        int id;
        String name;
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        name=sc.nextLine();
        System.out.println("My id is:"+id);
        System.out.println("My name is:"+name);
    }
}