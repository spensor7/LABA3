import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть речення: ");
            String sentence = scanner.nextLine();

            for (int i = 0; i < 50; i++) {
                System.out.println(sentence);
            }

            System.out.print("Бажаєте продовжити (Так/Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
            scanner.nextLine(); // Очистка буфера вводу
        }

        scanner.close();
    }
}