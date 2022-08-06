public class Main
{

    public static void main(String[] args)
    {
        for(int k = 0; k <= 30; k++)
        {
            System.out.println("k = " + k);
        }
        System.out.println("--------------------------------------------------");
        for(int k = 30; k >= 0; k--)
        {
            System.out.println("k = " + k);
        }
        System.out.println("--------------------------------------------------");
        for(int k = 0; k <= 18; k = k +3)
        {
            System.out.println("k = " + k);
        }
        System.out.println("--------------------------------------------------");
        for(int k = 10; k >= 0; k = k - 2)
        {
            System.out.println("k = " + k);
        }
        System.out.println("--------------------------------------------------");
        for (int k = 1; k <= 5; k++)
        {
            for (int j = 1; j <= k; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int k = 1; k <= 5; k++)
        {
            for (int j = 1; j <= (-1 * k + 6); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int k = 1; k <= 5; k++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int k = 1; k <= 3; k++)
        {
            for (int j = 1; j <= 18; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 3; k++)
        {
            for (int space = 1; space <= (k * -2 + 70); space = space + 10)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}