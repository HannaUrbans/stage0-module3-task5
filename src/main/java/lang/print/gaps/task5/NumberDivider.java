package lang.print.gaps.task5;

public class NumberDivider {

    static void divide(int toBeDivided)
   {int stringResult= toBeDivided/5;
     float floatResult;
       floatResult = Float.valueOf(stringResult);
       System.out.println(floatResult);
    }
          public static void main (String[]args)
           {
               int toBeDivided=50;
          divide(toBeDivided);
       }
}