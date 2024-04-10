import java.util.Scanner;

public class ChasFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Виводимо інформацію про години та хвилини за допомогою вкладеного циклу for
            for (int hour = 0; hour <= 2; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    System.out.printf("%d h %d min%n", hour, minute);
                }
            }

            // Питаємо користувача, чи він хоче повторити програму
            System.out.print("Бажаєте повторити програму (Так/Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }
}