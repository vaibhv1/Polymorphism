package Overriding;
import java.util.*;
public class Program1 {
    public static void main(String[] args)
    {
        Program2 x = new Program2();

        System.out.println(x.add(10,20,30));
        System.out.println(add(10,20));

    }
     static int add(int x,int y)
     {
         return x+y;
     }
}

class Program2 extends Program1 {
    static int add(int x,int y,int z)
    {
        return x+y+z;
    }
}
