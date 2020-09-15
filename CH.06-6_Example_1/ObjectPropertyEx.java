
/**
 * 
 * @author (2018210032_김태영) 
 * @version (20200915_ch.06-6-1)
 */
public class ObjectPropertyEx
{
    public static void main(String[] args){
        Point p = new Point(2,3);
        print(p);
    }
    
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}
