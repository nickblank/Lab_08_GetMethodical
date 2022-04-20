import java.util.Scanner;

public class CheckDate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean again = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-9.99]: ", 0.50, 9.99);
            totalPrice = totalPrice + itemPrice;
            again = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]: ");
        }while(again);

        System.out.printf("%2f",totalPrice);
    }
}
