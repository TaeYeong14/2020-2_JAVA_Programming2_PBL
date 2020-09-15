package app;
import lib.Calculator;

/**
 * 여기에 GoodCalc 클래스 설명을 작성하십시오.
 * 
 * @author (2018210032_김태영) 
 * @version (20200915_ch06-3)
 */
public class GoodCalc extends Calculator
{
   public int add(int a, int b) {
        return a + b;
    }
    
   public int substract(int a, int b) {
        return a - b;
    }
    
   public double average(int[] a) {
       double sum = 0;
       for(int i=0; i<a.length; i++)
       {
           sum+=a[i];
       }  
       return sum/a.length;
    }
    
   public static void main(String[] args) {
        Calculator c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.substract(2, 3));
        System.out.println(c.average(new int[] { 2,3,4 }));
    }
}
