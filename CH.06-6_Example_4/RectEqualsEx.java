
/**
 * 
 * @author (2018210032_김태영) 
 * @version (20200916_ch.06-6-4)
 */
public class RectEqualsEx
{
    public static void main(String[] args)
    {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);
        
        if(a.equals(b)) System.out.println("a is equal to b");
        if(a.equals(c)) System.out.println("a is equal to c");
        if(b.equals(c)) System.out.println("b is equal to c");
    }
}
