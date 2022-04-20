import java.util.Formatter;
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        double CStart=-100.0;
        double CEnd=100.0;
        int whitespace;
        while(CStart<=CEnd)
        {
            System.out.printf("|%-12.1f|", CStart);
            System.out.printf("%-15.1f", CtoF(CStart));
            System.out.println("\n");

            CStart+=1.00;
        }

    }


    public static double CtoF(double Celsius) {
        double fahren = ((9 * Celsius) / 5) + 32;
        return fahren;
    }


}