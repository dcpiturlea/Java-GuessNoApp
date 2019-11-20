import java.util.Scanner;


public class GuessNumber {
    public static void main(String args[]) {


        int number;
        int noOfGuess;
        int guess = 29;
        Scanner input = new Scanner(System.in);

        System.out.println("Ghiceste numarul la care ma gandesc(intre 0 si 100): ");
        number = input.nextInt();
        if (number != guess) {
            for (noOfGuess = 1; noOfGuess < 5; noOfGuess++) {
                if (noOfGuess == 4) {
                    System.out.println("Ai incercat de prea multe ori, ai pierdut, ne pare rau");
                    break;
                }
                if (number < 1 || number > 100) {
                    System.out.println("Introdu un numar intre 0 si 100: ");
                    number = input.nextInt();
                    continue;
                }
                if (number < guess) {
                    System.out.println("Introdu un numar mai mare:");
                    number = input.nextInt();
                    continue;
                }
                if (number > guess) {
                    System.out.println("Introdu un numar mai mic:");
                    number = input.nextInt();
                    continue;
                }

            }
        }
        if (number == guess) {
            System.out.println("Ai ghicit");
        }

    }
}



