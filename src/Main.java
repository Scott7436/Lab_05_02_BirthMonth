public class Main
{
    public static void main(String[] args)
    {
        int month = 14;

        if(1 <= month && month <= 12 )
        {
            System.out.println("Your Birth Month is " + month);
        }
        else
            System.out.println("You entered an incorrect month value: " + month);

    }
}