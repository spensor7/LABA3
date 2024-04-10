import java.util.Scanner;

public class ChasWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            int hour = 0;
            int minute = 0;

            // Виводимо інформацію про години та хвилини за допомогою циклу while
            while (hour <= 2) {
                while (minute < 60) {
                    System.out.printf("%d h %d min%n", hour, minute);
                    minute++;
                }
                minute = 0;
                hour++;
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