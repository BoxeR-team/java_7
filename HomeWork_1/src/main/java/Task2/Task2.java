package Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        System.out.print("Enter a symbols: ");
        Scanner scanner  = new Scanner(System.in);
        String newScan = scanner.nextLine();
        String letter = newScan.replaceAll("[^a-zA-Z]", "");
        System.out.println(letter.toUpperCase());
        String letterUpperCase = letter.toUpperCase();
        int memory[] = new int[256];
        for (int i = 0; i < letterUpperCase.length(); i++) {
            memory[(int) letterUpperCase.charAt(i)]++;
        }

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] != 0) {
                System.out.println((char) i + " - " + memory[i]);

            }

        }
    }
}
