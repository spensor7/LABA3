import java.util.Scanner;

public class ChasWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            int hour = 0;
            int minute = 0;
            int second = 0;

            // Виводимо інформацію про години, хвилини та секунди за допомогою циклу while
            while (hour <= 2) {
                while (minute < 60) {
                    while (second < 60) {
                        System.out.printf("%d h %d min %d sec%n", hour, minute, second);
                        second++;
                    }
                    second = 0;
                    minute++;
                }
                minute = 0;
                hour++;
            }

            // Питаємо користувача, чи він хоче продовжити програму
            System.out.print("Бажаєте повторити програму (Так/Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }
}
