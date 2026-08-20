class Box
{
    double Width;
    double height;
    double depth;
}
class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox=new Box();
        double vol;
        mybox.Width=10;
        mybox.height=20;
        mybox.depth=15;
        vol=mybox.Width*mybox.height*mybox.depth;
        System.out.println("volume is"+vol);
    }
}