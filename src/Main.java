import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNumber;
        String answer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworzenie tablicy 1 do X lub X do 1 i sortowanie bąbelkowe");
        System.out.println("Czy tablica ma być rosnąca? tak/nie");
        answer = scanner.next();
        System.out.println("Podaj liczbę elementów.");
        userNumber = scanner.nextInt();
        int[] userTable = new int[userNumber];

        if (answer.equals("tak")) {
            for (int i = 0; i < userTable.length; i++) {
                userTable[i] = i + 1;
            }
        } else if (answer.equals("nie")) {
            for (int i = 0; i < userTable.length; i++) {
                userTable[i] = userNumber - i;
            }
        }

        System.out.println("Tablica przed sortowaniem");
        for (int j : userTable) {
            System.out.printf("%d ", j);
        }

        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.sortTable(userTable);

    }
}
