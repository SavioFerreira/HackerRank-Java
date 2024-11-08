import java.util.Scanner;

public class Main {
    public static void main(String []argh)
    {

        /*
          -150
          150000
          1500000000
          213333333333333333333333333333333333
          -100000000000000
        **/

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();


        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");



            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
