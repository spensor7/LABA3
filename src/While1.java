import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть речення: ");
            String sentence = scanner.nextLine();
            int count = 0;

            while (count < 50) {
                System.out.println(sentence);
                count++;
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