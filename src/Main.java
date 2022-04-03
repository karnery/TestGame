import java.util.Scanner;

public class Main {

    public static int rows=3;
    public static int columns=4;
    public static int amountOfEnemies=10;
    public static int transistorsNeeded=100;
    public static int moves=40;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Добро пожаловать в игру. Пожалуйста, сделайте выбор: ");
            System.out.println("1 - начать игру");
            System.out.println("2 - опции");
            System.out.println("3 - авторы");
            System.out.println("4 - выход");

            command = scanner.nextLine();
            switch (command){

                case "1":
                    startNewGame();
                    break;
                case "2":
                    OptionsMenu.showOptionsMenu();
                    break;
                case "3":
                    showCredits();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Команда неверна, повторите ввод");


            }
        }
        while (!command.equals(("4")));
    }

    private static void showCredits() {
        System.out.println("Разработано Евгенией от 31.03.2022");
    }

    private static void openOptionsMenu() {
    }

    private static void startNewGame() {
    }
}
