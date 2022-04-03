import java.util.Scanner;

public class OptionsMenu {
    static Scanner scanner = new Scanner(System.in);
    static int command;

    public static void showOptionsMenu() {
        do {
            System.out.println("Сделайте выбор и нажмите Enter\n" +
                    "1: Показать текущие настройки\n" +
                    "2: Изменить настройки\n" +
                    "3: Выход");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Текущие настройки:\n" +
                            "строки: " + Main.rows +
                            "\nстолбцы: " + Main.columns +
                            "\nвраги: " + Main.amountOfEnemies +
                            "\nтранзисторы: " + Main.transistorsNeeded +
                            "\nходы: " + Main.moves);
                    break;
                case 2:
                    System.out.println("Введите новое значение количества строк");
                    Main.rows=scanner.nextInt();
                    System.out.println("Введите новое значение количества стлбцов");
                    Main.columns=scanner.nextInt();
                    System.out.println("Введите новое значение количества врагов");
                    Main.amountOfEnemies=scanner.nextInt();
                    System.out.println("Введите новое значение количества транзисторов");
                    Main.transistorsNeeded=scanner.nextInt();
                    System.out.println("Введите новое значение количества ходов");
                    Main.moves=scanner.nextInt();
                case 3:
                    break;
                default:
                    System.out.println("Команда не опознана, повторите ввод");
            }
        }
        while (command != 3);
    }

}
