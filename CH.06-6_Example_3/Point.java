
/**
 * 
 * @author (2018210032_김태영) 
 * @version (20200916_ch.06-6-3)
 */
public class Point
{
    private int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Object obj)
    {
        Point p = (Point)obj;
        if((this.x == p.x) && (this.y == p.y))
            return true;
        else
            return false;
    }
}
