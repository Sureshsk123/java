class box
{
    double width;
    double height;
    double depth;
    void get()
    {
        width = 10.5;
        height = 20.5;
        depth = 5.5;
    }
    void volume()
    {
        double v = width*height*depth;
        System.out.print("volume of box ="+v);
    }
}
class boxtest
{
    public static void main(String[] args)
    {
        box mybox = new box();
        mybox.get();
        mybox.volume();
    }
}

+999999999999