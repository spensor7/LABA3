import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Введення границь діапазону
            System.out.print("Введіть початкову границю діапазону: ");
            double start = scanner.nextDouble();
            System.out.print("Введіть кінцеву границю діапазону: ");
            double end = scanner.nextDouble();

            // Початок підрахунку
            double step = 0.2;
            int count = 0;

            for (double x = 0; x <= 4; x += step) {
                double fx = 3 * x - Math.pow(4 * Math.sin(x), 2);
                if (fx >= start && fx <= end) {
                    count++;
                }
            }

            // Виведення результату
            if (count > 0) {
                System.out.println("Кількість значень функції у заданому діапазоні: " + count);
            } else {
                System.out.println("Немає значень функції у заданому діапазоні.");
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