import java.util.Scanner;
import java.math.BigDecimal;    //importing BigDecimal to account for larger numbers and prevent long decimal outputs

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println("");

        boolean continuePrompt = true;  //initializing to true to begin while loop

        while (continuePrompt) {
            System.out.println("Enter length: ");
            BigDecimal lengthRoom = scan.nextBigDecimal();

            System.out.println("Enter width: ");
            BigDecimal widthRoom = scan.nextBigDecimal();

            System.out.println("Enter height: ");
            BigDecimal heightRoom = scan.nextBigDecimal();

            BigDecimal area = lengthRoom.multiply(widthRoom);
            System.out.println("Area: " + area);

            BigDecimal perimeter = (lengthRoom.add(widthRoom).multiply(new BigDecimal(2)));
            System.out.println("Perimeter: " + perimeter);

            BigDecimal volume = lengthRoom.multiply(widthRoom.multiply(heightRoom));
            System.out.println("Volume: " + volume);

            System.out.println("Continue? (y/n): ");
            String userAnswer = scan.next();

            if (userAnswer.equals("n")) {
                continuePrompt = false;
                System.out.println("Goodbye!");
            }

        }

    }
}
