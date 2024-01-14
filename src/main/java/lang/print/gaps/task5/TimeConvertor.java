package lang.print.gaps.task5;

public class TimeConvertor {
    public static void convert(float minutes)
         {float seconds= minutes*60;
            System.out.println(seconds);
        }
            public static void main (String[]args)
            {
            float minutes=2;
            convert(minutes);
        }
}

