import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int int1 = 0;
        boolean again = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt);

            if (pipe.hasNextInt()) {
                int1 = pipe.nextInt();
                pipe.nextLine();
                again = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter an integer, and not \"" + trash + "\"");
            }
        } while (!again);
        return int1;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double dub1 = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt);

            if (pipe.hasNextDouble()) {
                dub1 = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a double, and not \"" + trash + "\"");
            }
        } while (!done);
        return dub1;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int farInt = 0;
        boolean lame = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt);

            if (pipe.hasNextInt()) {
                farInt = pipe.nextInt();
                pipe.nextLine();
                if (farInt >= low && farInt <= high) {
                    lame = true;
                } else {
                    System.out.println("You entered \"" + farInt + "\"");
                    System.out.println("Enter an integer [" + low + "-" + high + "]");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter an integer, and not \"" + trash + "\"");
            }
        } while (!lame);

        return farInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double farDub = 0;
        boolean win = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt);

            if (pipe.hasNextDouble()) {
                farDub = pipe.nextDouble();
                pipe.nextLine();
                if (farDub >= low && farDub <= high) {
                    win = true;
                } else {
                    System.out.println("You entered \"" + farDub + "\"");
                    System.out.println("Enter a double [" + low + "-" + high + "]");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a double, and not \"" + trash + "\"");
            }
        } while (!win);
        return farDub;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        System.out.print(prompt);
        String continueYN = pipe.nextLine();

        while (!continueYN.equalsIgnoreCase("y") && !continueYN.equalsIgnoreCase("n")) {

            System.out.println("\nInvalid response. Try again.");
            continueYN = pipe.next();
        }
        if (continueYN.equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String trash = "";
        String retVal = "";

        do
        {
            System.out.print("\n" + prompt + " " + regEx + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Enter a matching pattern not: " + retVal);
            }
        }while(!done);

        return retVal;
    }
    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }
    public static double CtoF (double Celsius)
    {
        double fahren = ((9 * Celsius) / 5) + 32;
        return fahren;
    }
}
