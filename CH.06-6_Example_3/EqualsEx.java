
/**
 * 
 * @author (2018210032_김태영) 
 * @version (20200916_ch.06-6-3)
 */
public class EqualsEx
{
    public static void main(String[] args)
    {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);
        
        if(a==b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
    }
}
