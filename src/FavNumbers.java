import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int nickInt = 0;
        double nickDouble = 0;

        nickInt = SafeInput.getInt(userIn, "Enter your favorite integer: ");
        nickDouble = SafeInput.getDouble(userIn, "Enter your favorite double: ");
        System.out.println("Your favorite integer is " + nickInt + " and your favorite double is " + nickDouble);
    }
}
