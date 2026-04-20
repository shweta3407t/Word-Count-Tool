
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("ENTER SENTANCES : ");

            String text = sc.nextLine().toLowerCase();
            boolean isValide = utils.InputValidator.isValideInput(text);
            if (isValide) {
                continue;
            }
            boolean isRunning = true;
            while (isRunning) {
                HashMap<String, Integer> wordCount = new HashMap<>();

                System.out.println("""
                        \nENTER :
                        W : COUNT WORD
                        C : COUNT CHARACTER
                        S : COUNT SENTENCE
                        L : COUNT LINE
                        F : WORD FREQUENCY

                        R : RESTART COUNTER
                        E : EXIT
                                            """);
                System.out.print("CHOICE : ");

                String choice = sc.nextLine().toLowerCase();

                switch (choice) {
                    case "w":
                        service.WordCountService.word(text);

                        continue;

                    case "c":
                        service.WordCountService.character(text);
                        continue;
                    case "l":

                        service.WordCountService.line(text);

                        continue;

                    case "f":
                        service.WordCountService.wordFrequency(text, wordCount);

                        continue;
                    case "s":
                        service.WordCountService.sentence(text);
                        continue;

                    case "r":
                        isRunning = false;
                        System.out.println("----RESTART---");
                        continue;
                    case "e":
                        System.out.println("<<<<<EXITING PROGRAM>>>>>");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("INVALIDE OPTION SELECTED.");
                        break;
                }

            }

        }
    }
}
