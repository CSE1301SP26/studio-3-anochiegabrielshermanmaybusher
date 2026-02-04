import java.util.Scanner;
public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to check up to?");
        int amount = in.nextInt();
        boolean[] numbers = new boolean[amount+1];

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == false) {
                for (int num = 2*i; num < numbers.length; num+=i) {
                      numbers[num] = true;
                    }
                }
            }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}
