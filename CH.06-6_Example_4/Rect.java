
/**
 * 
 * @author (2018210032_김태영) 
 * @version (20200916_ch.06-6-4)
 */
public class Rect
{
    private int width, height;

    public Rect(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj)
    {
        Rect p = (Rect)obj;
        if(width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}
