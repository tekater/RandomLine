import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите size & seed:");
        int size = scanner.nextInt();
        int seed = scanner.nextInt();

        Random random = new Random(seed);

        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                if (random.nextBoolean() == true) {
                    System.out.print("O");
                }else if (random.nextBoolean() == false) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
