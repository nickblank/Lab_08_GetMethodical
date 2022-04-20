import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);

        int birthYear = 0;
        int birthMon = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMin = 0;

        birthYear = SafeInput.getRangedInt(userIn, "Enter birth year [1950-2010]: ", 1950, 2010);
        birthMon = SafeInput.getRangedInt(userIn, "Enter birth month [1-12]: ", 1, 12);

        switch (birthMon)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            birthDay = SafeInput.getRangedInt(userIn, "Enter birth day [1-31]: ", 1, 31);
            break;
            case 4: case 6: case 9: case 11:
            birthDay = SafeInput.getRangedInt(userIn, "Enter birth day [1-30]: ", 1, 30);
            break;
            case 2:
                birthDay = SafeInput.getRangedInt(userIn, "Enter birth day [1-28]: ", 1, 28);
                break;
        }

        birthHour = SafeInput.getRangedInt(userIn, "Enter birth hour [1-24]: ", 1, 24);
        birthMin = SafeInput.getRangedInt(userIn, "Enter birth minute [1-59]: ", 1, 59);

        System.out.println("You were born on " + birthMon + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMin);
    }
}
