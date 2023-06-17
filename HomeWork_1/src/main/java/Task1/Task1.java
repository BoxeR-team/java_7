package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter symbols: \n");
        String word = scanner.nextLine();
        char[] mass = word.toCharArray();
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            Boolean isDigit = Character.isDigit(mass[i]);
            if (isDigit) {
                int num = Character.getNumericValue(mass[i]);
                sum = sum + num;

            }
        }
        System.out.println(sum);
        if (sum ==sum){
            System.out.println("Done");
        }
    }
}